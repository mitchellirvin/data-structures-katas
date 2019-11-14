package katas.datastructures.list;

@SuppressWarnings("unchecked")
public class SolvedArrayList<E> implements List<E> {

    private static final int INITIAL_ARRAY_LENGTH = 10;

    private Object[] elements;
    private int size = 0;

    public SolvedArrayList() {
        elements = new Object[INITIAL_ARRAY_LENGTH];
    }

    // Does not account for upper limit of internal array length.
    public boolean add(E element) {
        ensureInternalArrayCapacity();
        elements[size] = element;
        size++;
        return true;
    }

    private void ensureInternalArrayCapacity() {
        if (size == elements.length) {
            Object[] temp = new Object[elements.length * 2];
            System.arraycopy(elements, 0, temp, 0, size);
            elements = temp;
        }
    }

    public boolean remove(int index) {
        if (outOfBoundsOfInternalArray(index)) {
            return false;
        }
        System.arraycopy(elements, index + 1, elements, index, size - 1 - index);
        size--;
        return true;
    }

    private boolean outOfBoundsOfInternalArray(int index) {
        return index < 0 || index > size - 1;
    }

    public E get(int index) {
        if (outOfBoundsOfInternalArray(index)) {
            throw new IndexOutOfBoundsException();
        }
        return getElement(index);
    }

    private E getElement(int index) {
        return (E) elements[index];
    }

    public boolean contains(E elementToFind) {
        for (int i = 0; i < size; i++) {
            if (getElement(i).equals(elementToFind)) {
                return true;
            }
        }
        return false;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return false;
    }
}
