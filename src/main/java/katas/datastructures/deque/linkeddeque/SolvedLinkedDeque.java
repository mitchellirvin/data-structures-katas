package katas.datastructures.deque.linkeddeque;

import katas.datastructures.deque.Deque;

import java.util.NoSuchElementException;

public class SolvedLinkedDeque<E> implements Deque<E> {

    private Node<E> head;
    private Node<E> tail;
    private int size;

    public void addFirst(E element) {
        if (head == null) {
            head = new Node<>(null, null, element);
            tail = head;
        } else {
            head.prev = new Node<>(head, null, element);
            head = head.prev;
        }
        size++;
    }

    public void addLast(E element) {
        if (head == null) {
            head = new Node<>(null, null, element);
            tail = head;
        } else {
            tail.next = new Node<>(null, tail, element);
            tail = tail.next;
        }
        size++;
    }

    public E removeFirst() {
        if (head == null) {
            throw new NoSuchElementException();
        }

        E removed = head.value;
        if (head == tail) {
            head = null;
            tail = null;
        } else {
            head = head.next;
        }
        size--;
        return removed;
    }

    public E removeLast() {
        if (tail == null) {
            throw new NoSuchElementException();
        }

        E removed = tail.value;
        if (head == tail) {
            head = null;
            tail = null;
        } else {
            tail = tail.prev;
        }
        size--;
        return removed;
    }

    public E peekFirst() {
        if (head == null) {
            throw new NoSuchElementException();
        }
        return head.value;
    }

    public E peekLast() {
        if (tail == null) {
            throw new NoSuchElementException();
        }
        return tail.value;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    private static class Node<E> {
        Node<E> next;
        Node<E> prev;
        E value;

        Node(Node<E> next, Node<E> prev, E value) {
            this.next = next;
            this.prev = prev;
            this.value = value;
        }
    }
}
