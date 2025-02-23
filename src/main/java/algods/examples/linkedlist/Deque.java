package algods.examples.linkedlist;

public class Deque {
    private DequeElement anchor;

    /** Creates a new empty Deque. */
    public Deque() {
        anchor = new DequeElement();
    }

    /** Returns true if the list is empty. */
    public boolean isEmpty() {
        return anchor.isEmpty();
    }

    /** Returns the number of elements in the list. */
    public int size() {
        return anchor.successorCount();
    }

    /**
     * Returns the value at position n.
     * Throws an Exception if the position is out of bounds.
     */
    public int get(int n) {
        var e = anchor.successor(n + 1);
        if (e == null) {
            throw new IndexOutOfBoundsException();
        }
        return e.value;
    }

    /** Adds an Element at the end of the list. */
    public void add(int value) {
        anchor.insertBefore(new DequeElement(value));
    }

    /**
     * Adds an Element at the given position.
     * Throws an Exception if the position is out of bounds.
     */
    public void add(int value, int pos) {
        var p = anchor.successor(pos);
        if (p == null) {
            throw new IndexOutOfBoundsException();
        }
        p.insertAfter(new DequeElement(value));
    }
}
