package test.java;

import main.java.Inscripcion;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class InscripcionTest {

    @Test
    void constructorYGetters_deberianFuncionarCorrectamente() {
        Inscripcion inscripcion = new Inscripcion(1, 100, 200, false);
        
        assertEquals(1, inscripcion.getId());
        assertEquals(100, inscripcion.getIdUsuario());
        assertEquals(200, inscripcion.getIdEvento());
        assertFalse(inscripcion.isCancelado());
    }

    @Test
    void setters_deberianActualizarValoresCorrectamente() {
        Inscripcion inscripcion = new Inscripcion();
        
        inscripcion.setId(2);
        inscripcion.setIdUsuario(101);
        inscripcion.setIdEvento(201);
        inscripcion.setCancelado(true);
        
        assertEquals(2, inscripcion.getId());
        assertEquals(101, inscripcion.getIdUsuario());
        assertEquals(201, inscripcion.getIdEvento());
        assertTrue(inscripcion.isCancelado());
    }

    @Test
    void buscarPorId_deberiaEncontrarInscripcionExistente() {
        Inscripcion[] inscripciones = {
            new Inscripcion(1, 100, 200, false),
            new Inscripcion(2, 101, 201, true),
            null
        };
        
        Inscripcion encontrada = Inscripcion.buscarPorId(inscripciones, 2);
        assertNotNull(encontrada);
        assertEquals(2, encontrada.getId());
        assertEquals(101, encontrada.getIdUsuario());
        assertTrue(encontrada.isCancelado());
    }

    @Test
    void agregarInscripcion_deberiaAgregarCorrectamente() {
        Inscripcion[] inscripciones = new Inscripcion[2];
        Inscripcion nueva = new Inscripcion(3, 102, 202, false);
        
        assertTrue(Inscripcion.agregarInscripcion(inscripciones, nueva));
        assertEquals(nueva, inscripciones[0]);
    }

    @Test
    void eliminarPorId_deberiaEliminarInscripcionExistente() {
        Inscripcion[] inscripciones = {
            new Inscripcion(1, 100, 200, false),
            new Inscripcion(2, 101, 201, true)
        };
        
        assertTrue(Inscripcion.eliminarPorId(inscripciones, 2));
        assertNull(inscripciones[1]);
    }
}