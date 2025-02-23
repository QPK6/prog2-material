package algods.examples.dynarray;

public class DynArray {
    private int[] data;
    private int size;
    private int capacity;

    /** Creates an empty dynamic array. */
    public DynArray() {
        this.data = new int[1];
        this.size = 0;
        this.capacity = 1;
    }

    /** Returns the number of elements in the array. */
    public int size() {
        return size;
    }

    /** Returns the element at the given index. */
    public int get(int index) {
        return data[index];
    }

    /**
     * Adds an element to the end of the array.
     * Resizes the array if necessary.
     */
    public void add(int value) {
        if (size == capacity) {
            resize(capacity * 2);
        }
        data[size] = value;
        size++;
    }

    /**
     * Extends the array by the given number of elements.
     * Resizes the array if necessary.
     */
    public void extend(int amount) {
        if (size + amount > capacity) {
            resize(size + amount);
        }
        size += amount;
    }

    /**
     * Replaces the current data array with a new one with the given capacity.
     * Copies all elements from the current array to the new array.
     */
    private void resize(int newCapacity) {
        int[] newData = new int[newCapacity];
        System.arraycopy(this.data, 0, newData, 0, size);
        this.data = newData;
        this.capacity = newCapacity;
    }
}
