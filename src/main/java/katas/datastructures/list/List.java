package katas.datastructures.list;

public interface List<T> {

    boolean add(T element);
    boolean remove(int index);
    T get(int index);
    boolean contains(T element);
    int size();
    boolean isEmpty();

}
