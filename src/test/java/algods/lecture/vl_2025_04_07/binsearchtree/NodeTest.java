package algods.lecture.vl_2025_04_07.binsearchtree;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertFalse;
import org.junit.jupiter.api.Test;

public class NodeTest {

    @Test
    public void testNew() {
        Node n = new Node();
        assertEquals(n.value, 0);
        assertEquals(n.left, null);
        assertEquals(n.right, null);
    }

    @Test
    public void testIsEmpty() {
        Node n = new Node();
        assertTrue(n.isEmpty());

        n.add(42);
        assertFalse(n.isEmpty());
        assertTrue(n.left.isEmpty());
        assertTrue(n.right.isEmpty());
    }

    @Test
    public void testAdd() {
        Node n = new Node();
        n.add(42);
        assertEquals(n.value, 42);

        n.add(15);
        assertFalse(n.left.isEmpty());
        assertEquals(n.value, 42);
        assertEquals(n.left.value, 15);

        assertTrue(n.right.isEmpty());
        assertTrue(n.left.left.isEmpty());
        assertTrue(n.left.right.isEmpty());
    }

    @Test
    public void TestElementsInOrder() {
        Node n = new Node();
        assertEquals(new ArrayList<Integer>(), n.elementsInOrder());

        n.add(42);
        n.add(15);
        n.add(37);
        n.add(256);

        List<Integer> actual = n.elementsInOrder();
        List<Integer> expected = List.of(15, 37, 42, 256);

        assertEquals(expected, actual);
    }

    @Test
    public void TestElementsPreOrder() {
        Node n = new Node();
        assertEquals(new ArrayList<Integer>(), n.elementsPreOrder());

        n.add(42);
        n.add(15);
        n.add(37);
        n.add(256);

        List<Integer> actual = n.elementsPreOrder();
        List<Integer> expected = List.of(42, 15, 37, 256);

        assertEquals(expected, actual);
    }

    @Test
    public void TestHeight() {
        Node n = new Node();

        assertEquals(0, n.height());

        n.add(42);
        assertEquals(1, n.height());

        n.add(15);
        assertEquals(2, n.height());
        assertEquals(1, n.left.height());
        assertEquals(0, n.right.height());
    }
}
