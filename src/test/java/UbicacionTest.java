package test.java;

import main.java.Ubicacion;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class UbicacionTest {

    @Test
    void constructorYGetters_deberianFuncionarCorrectamente() {
        Ubicacion ubicacion = new Ubicacion(1, true, "Calle Falsa 123");
        
        assertEquals(1, ubicacion.getId());
        assertTrue(ubicacion.isOnline());
        assertEquals("Calle Falsa 123", ubicacion.getDireccion());
    }

    @Test
    void setters_deberianActualizarValoresCorrectamente() {
        Ubicacion ubicacion = new Ubicacion();
        
        ubicacion.setId(2);
        ubicacion.setOnline(false);
        ubicacion.setDireccion("Av. Siempre Viva 742");
        
        assertEquals(2, ubicacion.getId());
        assertFalse(ubicacion.isOnline());
        assertEquals("Av. Siempre Viva 742", ubicacion.getDireccion());
    }

    @Test
    void buscarPorId_deberiaEncontrarUbicacionExistente() {
        Ubicacion[] ubicaciones = {
            new Ubicacion(1, true, "Online"),
            new Ubicacion(2, false, "Presencial"),
            null
        };
        
        Ubicacion encontrada = Ubicacion.buscarPorId(ubicaciones, 2);
        assertNotNull(encontrada);
        assertEquals(2, encontrada.getId());
        assertFalse(encontrada.isOnline());
        assertEquals("Presencial", encontrada.getDireccion());
    }

    @Test
    void agregarUbicacion_deberiaAgregarCorrectamente() {
        Ubicacion[] ubicaciones = new Ubicacion[2];
        Ubicacion nueva = new Ubicacion(3, false, "Nueva Direccion");
        
        assertTrue(Ubicacion.agregarUbicacion(ubicaciones, nueva));
        assertEquals(nueva, ubicaciones[0]);
    }

    @Test
    void eliminarPorId_deberiaEliminarUbicacionExistente() {
        Ubicacion[] ubicaciones = {
            new Ubicacion(1, true, "Online"),
            new Ubicacion(2, false, "Presencial")
        };
        
        assertTrue(Ubicacion.eliminarPorId(ubicaciones, 2));
        assertNull(ubicaciones[1]);
    }
}