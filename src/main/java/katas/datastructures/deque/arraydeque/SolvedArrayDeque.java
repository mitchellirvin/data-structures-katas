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
        head = (head - 1) & (elements.length - 1);
        elements[head] = element;
        size++;

        if (head == tail) {
            doubleCapacity();
        }
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
        tail = (tail + 1) & (elements.length - 1);

        if (tail == head) {
            doubleCapacity();
        }
    }

    public E removeFirst() {
        return null;
    }

    public E removeLast() {
        return null;
    }

    public E peekFirst() {
        return (E) elements[head];
    }

    public E peekLast() {
        return (E) elements[(tail - 1) & (elements.length - 1)];
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return false;
    }

}
