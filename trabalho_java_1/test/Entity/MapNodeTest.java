package Entity;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MapNodeTest {

    @Test
    public void testMapNodeCreation() {
        MapNode<String, Integer> mapNode = new MapNode<>("Key", 42);
        assertNotNull(mapNode);
        assertEquals("Key", mapNode.key);
        assertEquals(42, mapNode.value);
    }

    @Test
    public void testMapNodeWithDifferentTypes() {
        MapNode<Integer, String> mapNode = new MapNode<>(42, "Value");
        assertNotNull(mapNode);
        assertEquals(42, mapNode.key);
        assertEquals("Value", mapNode.value);
    }

    @Test
    public void testMapNodeWithNullKey() {
        MapNode<String, Integer> mapNode = new MapNode<>(null, 42);
        assertNotNull(mapNode);
        assertNull(mapNode.key);
        assertEquals(42, mapNode.value);
    }

    @Test
    public void testMapNodeWithNullValue() {
        MapNode<String, Integer> mapNode = new MapNode<>("Key", null);
        assertNotNull(mapNode);
        assertEquals("Key", mapNode.key);
        assertNull(mapNode.value);
    }
}
