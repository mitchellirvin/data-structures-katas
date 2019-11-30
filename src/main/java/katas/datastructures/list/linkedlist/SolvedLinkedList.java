package katas.datastructures.list.linkedlist;

import katas.datastructures.list.List;

public class SolvedLinkedList<T> implements List<T> {

    private SolvedNode<T> head;
    private SolvedNode<T> tail;
    private int size = 0;

    public SolvedLinkedList() {
    }

    public boolean add(T element) {
        if (size == 0) {
            head = new SolvedNode<>(null, element);
        } else if (size == 1) {
            tail = new SolvedNode<>(null, element);
            head.next = tail;
        } else {
            tail.next = new SolvedNode<>(null, element);
            tail = tail.next;
        }
        size++;
        return true;
    }

    public boolean remove(int indexToRemove) {
        if (isOutOfBounds(indexToRemove)) {
            throw new IndexOutOfBoundsException();
        }
        removeNodeAtIndex(indexToRemove);
        size--;
        return true;
    }

    private boolean isOutOfBounds(int indexToRemove) {
        return indexToRemove < 0 || indexToRemove > size - 1;
    }

    private void removeNodeAtIndex(int indexToRemove) {
        if (indexToRemove == 0) {
            head = head.next;
        } else {
            SolvedNode<T> current = getNodeAtPosition(indexToRemove - 1);
            current.next = current.next.next;
        }
    }

    private SolvedNode<T> getNodeAtPosition(int index) {
        SolvedNode<T> current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current;
    }

    public T get(int index) {
        if (isOutOfBounds(index)) {
            throw new IndexOutOfBoundsException();
        }

        SolvedNode<T> current = getNodeAtPosition(index);
        return current.value;
    }

    public boolean contains(T element) {
        SolvedNode<T> current = head;
        for (int i = 0; i < size; i++) {
            if (current.value.equals(element)) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    private static class SolvedNode<T> {
        SolvedNode<T> next;
        T value;

        SolvedNode(SolvedNode<T> next, T value) {
            this.next = next;
            this.value = value;
        }
    }
}
