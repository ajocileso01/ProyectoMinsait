package test.java;

import main.java.Organizador;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class OrganizadorTest {

    @Test
    void constructorYGetters_deberianFuncionarCorrectamente() {
        Organizador organizador = new Organizador(1, "Juan", "juan@email.com", "pass123");
        
        assertEquals(1, organizador.getId());
        assertEquals("Juan", organizador.getNombre());
        assertEquals("juan@email.com", organizador.getEmail());
        assertEquals("pass123", organizador.getPassword());
    }

    @Test
    void setters_deberianActualizarValoresCorrectamente() {
        Organizador organizador = new Organizador();
        
        organizador.setId(2);
        organizador.setNombre("Ana");
        organizador.setEmail("ana@email.com");
        organizador.setPassword("secret");
        
        assertEquals(2, organizador.getId());
        assertEquals("Ana", organizador.getNombre());
        assertEquals("ana@email.com", organizador.getEmail());
        assertEquals("secret", organizador.getPassword());
    }

    @Test
    void buscarPorId_deberiaEncontrarOrganizadorExistente() {
        Organizador[] organizadores = {
            new Organizador(1, "Juan", "juan@email.com", "pass123"),
            new Organizador(2, "Ana", "ana@email.com", "secret"),
            null
        };
        
        Organizador encontrado = Organizador.buscarPorId(organizadores, 2);
        assertNotNull(encontrado);
        assertEquals(2, encontrado.getId());
        assertEquals("Ana", encontrado.getNombre());
    }

    @Test
    void agregarOrganizador_deberiaAgregarCorrectamente() {
        Organizador[] organizadores = new Organizador[2];
        Organizador nuevo = new Organizador(3, "Luis", "luis@email.com", "clave");
        
        assertTrue(Organizador.agregarOrganizador(organizadores, nuevo));
        assertEquals(nuevo, organizadores[0]);
    }

    @Test
    void eliminarPorId_deberiaEliminarOrganizadorExistente() {
        Organizador[] organizadores = {
            new Organizador(1, "Juan", "juan@email.com", "pass123"),
            new Organizador(2, "Ana", "ana@email.com", "secret")
        };
        
        assertTrue(Organizador.eliminarPorId(organizadores, 2));
        assertNull(organizadores[1]);
    }
}