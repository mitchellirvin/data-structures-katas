package katas.datastructures.deque.arraydeque;

import katas.datastructures.deque.Deque;

@SuppressWarnings("unchecked")
public class SolvedArrayDeque<E> implements Deque<E> {

    private Object[] elements;

    /**
     * The index of the element at the head of the deque
     */
    private int head = 0;

    /**
     * The index at which the next element would be added to the tail
     */
    private int tail = 0;

    /**
     * Number of elements in the deque
     */
    private int size = 0;

    public SolvedArrayDeque() {
        this.elements = new Object[16];
    }

    public void addFirst(E element) {
        head = wrappingDecrement(head);
        elements[head] = element;
        size++;

        if (head == tail) {
            doubleCapacity();
        }
    }

    private int wrappingDecrement(int operand) {
        return (operand - 1) & (elements.length - 1);
    }

    private void doubleCapacity() {
        int wrapped = elements.length - head;
        int prevLength = elements.length;
        Object[] tmp = new Object[elements.length * 2];
        System.arraycopy(elements, head, tmp, 0, wrapped);
        System.arraycopy(elements, 0, tmp, wrapped, head);
        elements = tmp;
        head = 0;
        tail = prevLength;
    }

    public void addLast(E element) {
        elements[tail] = element;
        size++;
        tail = wrappingIncrement(tail);

        if (tail == head) {
            doubleCapacity();
        }
    }

    private int wrappingIncrement(int operand) {
        return (operand + 1) & (elements.length - 1);
    }

    public E removeFirst() {
        E first = (E) elements[head];
        if (first == null) {
            return null;
        }
        elements[head] = null;
        head = wrappingIncrement(head);
        size--;
        return first;
    }

    public E removeLast() {
        int lastIndex = wrappingDecrement(tail);
        E last = (E) elements[lastIndex];
        if (last == null) {
            return null;
        }
        elements[lastIndex] = null;
        tail = lastIndex;
        size--;
        return last;
    }

    public E peekFirst() {
        return (E) elements[head];
    }

    public E peekLast() {
        return (E) elements[wrappingDecrement(tail)];
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

}
