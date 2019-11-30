package katas.datastructures.list.arraylist;

import katas.datastructures.list.List;

@SuppressWarnings("unchecked")
public class SolvedArrayList<T> implements List<T> {

    private static final int INITIAL_ARRAY_LENGTH = 10;

    private Object[] elements;
    private int size = 0;

    public SolvedArrayList() {
        elements = new Object[INITIAL_ARRAY_LENGTH];
    }

    // Does not account for upper limit of internal array length.
    public boolean add(T element) {
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

    public boolean remove(int indexToRemove) {
        if (isOutOfBounds(indexToRemove)) {
            return false;
        }
        System.arraycopy(elements, indexToRemove + 1, elements, indexToRemove, size - 1 - indexToRemove);
        size--;
        return true;
    }

    private boolean isOutOfBounds(int index) {
        return index < 0 || index > size - 1;
    }

    public T get(int index) {
        if (isOutOfBounds(index)) {
            throw new IndexOutOfBoundsException();
        }
        return getElement(index);
    }

    private T getElement(int index) {
        return (T) elements[index];
    }

    public boolean contains(T elementToFind) {
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
        return size == 0;
    }
}
