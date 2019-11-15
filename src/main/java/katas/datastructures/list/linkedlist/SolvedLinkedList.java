package katas.datastructures.list.linkedlist;

import katas.datastructures.list.List;

public class SolvedLinkedList<T> implements List<T> {

    private SolvedNode<T> head;
    private SolvedNode<T> tail;
    private int size = 0;

    public SolvedLinkedList() {
    }

    public boolean add(T element) {
        if (head == null) {
            head = new SolvedNode<>(null, element);
        } else if (tail == null) {
            tail = new SolvedNode<>(null, element);
            head.next = tail;
        } else {
            tail.next = new SolvedNode<>(null, element);
            tail = tail.next;
        }
        size++;
        return true;
    }

    public boolean remove(int index) {
        if (index < 0 || index > size - 1) {
            throw new IndexOutOfBoundsException();
        }

        return false;
    }

    public T get(int index) {
        if (index < 0 || index > size - 1) {
            throw new IndexOutOfBoundsException();
        }

        SolvedNode<T> current = head;
        for(int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.value;
    }

    public boolean contains(T element) {
        return false;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return false;
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
