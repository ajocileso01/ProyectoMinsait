package test.java;

import main.java.Categoria;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CategoriaTest {

    @Test
    void constructorYGetters_deberianFuncionarCorrectamente() {
        Categoria cat = new Categoria(1, "Conferencia");
        
        assertEquals(1, cat.getId());
        assertEquals("Conferencia", cat.getNombre());
    }

    @Test
    void setters_deberianActualizarValores() {
        Categoria cat = new Categoria();
        
        cat.setId(2);
        cat.setNombre("Taller");
        
        assertEquals(2, cat.getId());
        assertEquals("Taller", cat.getNombre());
    }

    @Test
    void buscarPorId_deberiaEncontrarCategoriaExistente() {
        Categoria[] categorias = {
            new Categoria(1, "Conferencia"),
            new Categoria(2, "Taller"),
            null
        };
        
        Categoria resultado = Categoria.buscarPorId(categorias, 2);
        assertNotNull(resultado);
        assertEquals(2, resultado.getId());
    }

    @Test
    void agregarCategoria_deberiaAgregarEnPrimerEspacioVacio() {
        Categoria[] categorias = new Categoria[3];
        Categoria nueva = new Categoria(3, "Workshop");
        
        assertTrue(Categoria.agregarCategoria(categorias, nueva));
        assertEquals(nueva, categorias[0]);
    }

    @Test
    void eliminarPorId_deberiaEliminarCategoriaExistente() {
        Categoria[] categorias = {
            new Categoria(1, "Conferencia"),
            new Categoria(2, "Taller")
        };
        
        assertTrue(Categoria.eliminarPorId(categorias, 2));
        assertNull(categorias[1]);
    }
}