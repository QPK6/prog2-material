package algods.examples.linkedlist;

public class DequeElement {

    public int value;

    public DequeElement next;
    public DequeElement prev;

    /** Creates a new element for an empty list. */
    public DequeElement() {
        value = 0;
        next = this;
        prev = this;
    }

    /**
     * Creates a new element with the given value.
     * The new Element will be empty despite the value,
     * i.e. the next and prev pointers will point to this.
     */
    public DequeElement(int value) {
        this.value = value;
        next = this;
        prev = this;
    }

    /** Returns true if the list is empty. */
    public boolean isEmpty() {
        return next == this;
    }

    /**
     * Returns the n-th successor of this.
     * Returns null if n is out of bounds.
     */
    public DequeElement successor(int n) {
        if (n < 0) {
            return null;
        }
        DequeElement e = this;
        for (; n != 0; n--) {
            e = e.next;
            if (e == this) {
                return null;
            }
        }
        return e;
    }

    /** Returns the number of successors of this. */
    public int successorCount() {
        DequeElement e = this;
        int count = 0;
        while (e.next != this) {
            e = e.next;
            count++;
        }
        return count;
    }

    /** Inserts an element after this. */
    public void insertAfter(DequeElement e) {
        e.prev = this;
        e.next = next;
        next.prev = e;
        next = e;
    }

    /** Inserts an element before this. */
    public void insertBefore(DequeElement e) {
        e.prev = prev;
        e.next = this;
        prev.next = e;
        prev = e;
    }
}
