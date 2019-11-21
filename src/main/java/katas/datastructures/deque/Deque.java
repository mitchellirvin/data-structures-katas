package katas.datastructures.deque;

public interface Deque<E> {

    /**
     * Adds (prepends) an element to the front of the queue
     * @param element element to add
     */
    void addFirst(E element);

    /**
     * Adds (appends) an element to the rear of the queue
     * @param element element to add
     */
    void addLast(E element);

    /**
     * Removes the element at the front of the queue
     * @return element removed from front of queue
     */
    E removeFirst();

    /**
     * Removes the element at the rear of the queue
     * @return element removed from the rear of queue
     */
    E removeLast();

    /**
     * Returns, but not removes, element at front of queue
     * @return element at front of queue
     */
    E peekFirst();

    /**
     * Returns, but not removes, element at rear of queue
     * @return element at rear of queue
     */
    E peekLast();

    /**
     * Returns number of elements in the queue
     * @return int representing number of elements in queue
     */
    int size();

}
