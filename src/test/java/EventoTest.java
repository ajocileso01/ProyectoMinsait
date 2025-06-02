package test.java;

import main.java.Evento;
import org.junit.jupiter.api.Test;
import java.util.Date;
import static org.junit.jupiter.api.Assertions.*;

class EventoTest {

    @Test
    void constructorYGetters_deberianFuncionarCorrectamente() {
        Date fecha = new Date();
        Evento evento = new Evento(1, "Conferencia", fecha, 120, 10, 20, 30);
        
        assertEquals(1, evento.getId());
        assertEquals("Conferencia", evento.getNombre());
        assertEquals(fecha, evento.getFecha());
        assertEquals(120, evento.getDuracion());
        assertEquals(10, evento.getIdUbicacion());
        assertEquals(20, evento.getIdOrganizador());
        assertEquals(30, evento.getIdCategoria());
    }

    @Test
    void esEventoFuturo_deberiaRetornarTrueParaFechaFutura() {
        Date futuro = new Date(System.currentTimeMillis() + 86400000); // +1 día
        Evento evento = new Evento(1, "Futuro", futuro, 60, 1, 1, 1);
        assertTrue(evento.esEventoFuturo());
    }

    @Test
    void esEventoFuturo_deberiaRetornarFalseParaFechaPasada() {
        Date pasado = new Date(System.currentTimeMillis() - 86400000); // -1 día
        Evento evento = new Evento(1, "Pasado", pasado, 60, 1, 1, 1);
        assertFalse(evento.esEventoFuturo());
    }

    @Test
    void obtenerDuracionFormateada_deberiaFormatearCorrectamente() {
        Evento evento = new Evento(1, "Evento", new Date(), 90, 1, 1, 1);
        assertEquals("90 horas", evento.obtenerDuracionFormateada());
    }

    @Test
    void setters_deberianActualizarValoresCorrectamente() {
        Evento evento = new Evento();
        Date nuevaFecha = new Date();
        
        evento.setId(2);
        evento.setNombre("Taller");
        evento.setFecha(nuevaFecha);
        evento.setDuracion(60);
        evento.setIdUbicacion(5);
        evento.setIdOrganizador(6);
        evento.setIdCategoria(7);
        
        assertEquals(2, evento.getId());
        assertEquals("Taller", evento.getNombre());
        assertEquals(nuevaFecha, evento.getFecha());
        assertEquals(60, evento.getDuracion());
        assertEquals(5, evento.getIdUbicacion());
        assertEquals(6, evento.getIdOrganizador());
        assertEquals(7, evento.getIdCategoria());
    }
}