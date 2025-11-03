package genericlist;

@SuppressWarnings("unchecked")
public class MyList<T> {

    private static final int DEFAULT_CAPACITY = 10;

    private T[] elements;   // backing array
    private int size;       // number of valid elements

    // Constructors
    public MyList() {
        this.elements = (T[]) new Object[DEFAULT_CAPACITY];
        this.size = 0;
    }

    public MyList(int capacity) {
        if (capacity <= 0) capacity = DEFAULT_CAPACITY;
        this.elements = (T[]) new Object[capacity];
        this.size = 0;
    }

    // Current element count
    public int size() {
        return this.size;
    }

    // Current array capacity
    public int getCapacity() {
        return this.elements.length;
    }

    // Add element to the end (grow x2 if full)
    public void add(T data) {
        ensureCapacity(size + 1);
        elements[size++] = data;
    }

    // Get value by index (returns null if invalid)
    public T get(int index) {
        if (!isValidIndex(index)) return null;
        return elements[index];
    }

    // Remove by index; shift left; return removed (null if invalid)
    public T remove(int index) {
        if (!isValidIndex(index)) return null;
        T removed = elements[index];
        int moveCount = size - index - 1;
        if (moveCount > 0) {
            System.arraycopy(elements, index + 1, elements, index, moveCount);
        }
        elements[--size] = null; // avoid memory leak
        return removed;
    }

    // Replace value at index; return previous (null if invalid)
    public T set(int index, T data) {
        if (!isValidIndex(index)) return null;
        T prev = elements[index];
        elements[index] = data;
        return prev;
    }

    // String representation like [a,b,c]
    @Override
    public String toString() {
        if (size == 0) return "[]";
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        for (int i = 0; i < size; i++) {
            sb.append(elements[i]);
            if (i != size - 1) sb.append(',');
        }
        sb.append(']');
        return sb.toString();
    }

    // First index of data or -1 if not found
    public int indexOf(T data) {
        for (int i = 0; i < size; i++) {
            if (equalsElem(elements[i], data)) return i;
        }
        return -1;
    }

    // Last index of data or -1 if not found
    public int lastIndexOf(T data) {
        for (int i = size - 1; i >= 0; i--) {
            if (equalsElem(elements[i], data)) return i;
        }
        return -1;
    }

    // Is list empty?
    public boolean isEmpty() {
        return size == 0;
    }

    // Copy to new array with same logical size
    public T[] toArray() {
        T[] arr = (T[]) new Object[size];
        System.arraycopy(elements, 0, arr, 0, size);
        return arr;
    }

    // Clear all items and reset to default capacity
    public void clear() {
        this.elements = (T[]) new Object[DEFAULT_CAPACITY];
        this.size = 0;
    }

    // Return sublist from start..finish (inclusive). If invalid, return empty list.
    public MyList<T> subList(int start, int finish) {
        MyList<T> sub = new MyList<>(Math.max( (finish - start + 1), DEFAULT_CAPACITY ));
        if (start < 0 || finish < 0 || start >= size || finish >= size || start > finish) {
            return new MyList<>(); // empty if invalid range
        }
        for (int i = start; i <= finish; i++) {
            sub.add(elements[i]);
        }
        return sub;
    }

    // Contains element?
    public boolean contains(T data) {
        return indexOf(data) != -1;
    }

    // Helpers
    private void ensureCapacity(int minCapacity) {
        if (minCapacity <= elements.length) return;
        int newCap = elements.length * 2;
        if (newCap < minCapacity) newCap = minCapacity;
        T[] newArr = (T[]) new Object[newCap];
        System.arraycopy(elements, 0, newArr, 0, size);
        elements = newArr;
    }

    private boolean isValidIndex(int index) {
        return index >= 0 && index < size;
    }

    private boolean equalsElem(T a, T b) {
        return (a == b) || (a != null && a.equals(b));
    }
}