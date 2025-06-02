package test.java;

import main.java.Usuario;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class UsuarioTest {

    @Test
    void constructorYGetters_deberianFuncionarCorrectamente() {
        Usuario usuario = new Usuario(1, "Juan", "juan@mail.com", "pass123");
        
        assertEquals(1, usuario.getId());
        assertEquals("Juan", usuario.getNombre());
        assertEquals("juan@mail.com", usuario.getEmail());
        assertEquals("pass123", usuario.getPassword());
    }

    @Test
    void setters_deberianActualizarValoresCorrectamente() {
        Usuario usuario = new Usuario();
        
        usuario.setId(2);
        usuario.setNombre("Ana");
        usuario.setEmail("ana@mail.com");
        usuario.setPassword("nuevaPass");
        
        assertEquals(2, usuario.getId());
        assertEquals("Ana", usuario.getNombre());
        assertEquals("ana@mail.com", usuario.getEmail());
        assertEquals("nuevaPass", usuario.getPassword());
    }

    @Test
    void buscarPorId_deberiaEncontrarUsuarioExistente() {
        Usuario[] usuarios = {
            new Usuario(1, "Juan", "juan@mail.com", "pass"),
            new Usuario(2, "Ana", "ana@mail.com", "clave"),
            null
        };
        
        Usuario encontrado = Usuario.buscarPorId(usuarios, 2);
        assertNotNull(encontrado);
        assertEquals(2, encontrado.getId());
        assertEquals("Ana", encontrado.getNombre());
    }

    @Test
    void buscarPorId_deberiaRetornarNullParaUsuarioInexistente() {
        Usuario[] usuarios = {
            new Usuario(1, "Juan", "juan@mail.com", "pass"),
            null
        };
        
        assertNull(Usuario.buscarPorId(usuarios, 99));
    }

    @Test
    void agregarUsuario_deberiaAgregarEnPrimerEspacioVacio() {
        Usuario[] usuarios = new Usuario[3];
        Usuario nuevo = new Usuario(3, "Luis", "luis@mail.com", "abc");
        
        assertTrue(Usuario.agregarUsuario(usuarios, nuevo));
        assertEquals(nuevo, usuarios[0]);
    }

    @Test
    void eliminarPorId_deberiaEliminarUsuarioExistente() {
        Usuario[] usuarios = {
            new Usuario(1, "Juan", "juan@mail.com", "pass"),
            new Usuario(2, "Ana", "ana@mail.com", "clave")
        };
        
        assertTrue(Usuario.eliminarPorId(usuarios, 2));
        assertNull(usuarios[1]);
    }
}