package Entity;

import Entity.Mapa;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

public class MapaTest {

    private Mapa<String, Integer> mapa;

    @BeforeEach
    public void setUp() {
        mapa = new Mapa<>();
    }

    @Test
    public void testPutAndGet() {
        mapa.put("Chave1", 42);
        mapa.put("Chave2", 100);

        assertEquals(42, mapa.get("Chave1"));
        assertEquals(100, mapa.get("Chave2"));
    }

    @Test
    public void testRemove() {
        mapa.put("Chave1", 42);
        mapa.put("Chave2", 100);

        mapa.remove("Chave1");
        assertFalse(mapa.containsKey("Chave1"));
        assertEquals(100, mapa.get("Chave2"));
    }

    @Test
    public void testContainsKey() {
        mapa.put("Chave1", 42);
        mapa.put("Chave2", 100);

        assertTrue(mapa.containsKey("Chave1"));
        assertTrue(mapa.containsKey("Chave2"));
        assertFalse(mapa.containsKey("Chave3"));
    }

    @Test
    public void testNoSuchElementException() {
        assertThrows(NoSuchElementException.class, () -> mapa.get("ChaveInexistente"));
    }

    @Test
    public void testMostrarMapa() {
        mapa.put("Chave1", 42);
        mapa.put("Chave2", 100);

        mapa.mostrarMapa();    }
}
