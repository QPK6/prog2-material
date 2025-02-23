package algods.examples.linkedlist;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class DequeTest {

    @Test
    public void testNew() {
        Deque deque = new Deque();
        assertTrue(deque.isEmpty());
        assertTrue(deque.size() == 0);
    }

    @Test
    public void testAdd_end() {
        Deque deque = new Deque();
        deque.add(10);
        deque.add(20);
        deque.add(30);
        assertTrue(!deque.isEmpty());
        assertEquals(3, deque.size());

        assertEquals(10, deque.get(0));
        assertEquals(20, deque.get(1));
        assertEquals(30, deque.get(2));
    }

    @Test
    public void testAdd_pos() {
        Deque deque = new Deque();
        deque.add(20, 0);
        deque.add(10, 0);
        deque.add(40, 2);
        deque.add(30, 2);

        assertTrue(!deque.isEmpty());
        assertEquals(4, deque.size());

        assertEquals(10, deque.get(0));
        assertEquals(20, deque.get(1));
        assertEquals(30, deque.get(2));
        assertEquals(40, deque.get(3));
    }
}
