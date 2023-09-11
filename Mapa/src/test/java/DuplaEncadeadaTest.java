package org.example;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class DuplaEncadeadaTest {
    private DuplaEncadeada<Integer> list;

    @Before
    public void setUp() {
        list = new DuplaEncadeada<>();
    }

    @Test
    public void testAddFirst() {
        list.addFirst(1);
        list.addFirst(2);
        assertEquals(2, (int) list.removeFirst());
        assertEquals(1, (int) list.removeFirst());
    }

    @Test
    public void testAddLast() {
        list.addLast(1);
        list.addLast(2);
        assertEquals(1, (int) list.removeFirst());
        assertEquals(2, (int) list.removeFirst());
    }

    @Test
    public void testRemoveFirst() {
        list.addLast(1);
        list.addLast(2);
        assertEquals(1, (int) list.removeFirst());
        assertEquals(2, (int) list.removeFirst());
    }

    @Test
    public void testRemoveLast() {
        list.addLast(1);
        list.addLast(2);
        assertEquals(2, (int) list.removeLast());
        assertEquals(1, (int) list.removeLast());
    }

    @Test
    public void testSize() {
        assertEquals(0, list.size());
        list.addLast(1);
        list.addLast(2);
        assertEquals(2, list.size());
        list.removeFirst();
        assertEquals(1, list.size());
    }

    @Test
    public void testIsEmpty() {
        assertTrue(list.isEmpty());
        list.addLast(1);
        assertFalse(list.isEmpty());
        list.removeFirst();
        assertTrue(list.isEmpty());
    }

    @Test(expected = IllegalStateException.class)
    public void testRemoveFirstFromEmptyList() {
        list.removeFirst();
    }

    @Test(expected = IllegalStateException.class)
    public void testRemoveLastFromEmptyList() {
        list.removeLast();
    }
}
