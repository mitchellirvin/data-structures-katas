package katas.datastructures.deque;

public interface Deque<E> {

    void addFirst(E element);
    void addLast(E element);
    E removeFirst();
    E removeLast();
    E peekFirst();
    E peekLast();
    int size();

}
