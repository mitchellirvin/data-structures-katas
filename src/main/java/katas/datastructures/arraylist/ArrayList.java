package katas.datastructures.arraylist;

public interface ArrayList<T> {

    boolean add(T element);
    boolean remove(int index);
    T get(int index);
    boolean contains(T element);
    int size();
    boolean isEmpty();

}
