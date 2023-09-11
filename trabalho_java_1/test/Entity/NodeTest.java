import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class NodeTest {

    @Test
    public void testNodeCreation() {
        Node<Integer> node = new Node<>(42);
        assertNotNull(node);
        assertEquals(42, node.Data);
        assertNull(node.next);
        assertNull(node.prev);
    }

    @Test
    public void testNodeWithData() {
        Node<String> node = new Node<>("Hello");
        assertNotNull(node);
        assertEquals("Hello", node.Data);
        assertNull(node.next);
        assertNull(node.prev);
    }

    @Test
    public void testNodeWithNullData() {
        Node<String> node = new Node<>(null);
        assertNotNull(node);
        assertNull(node.Data);
        assertNull(node.next);
        assertNull(node.prev);
    }
}