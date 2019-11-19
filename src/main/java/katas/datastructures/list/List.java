package katas.datastructures.list;

public interface List<T> {

    /**
     * Add the specified element to the end of the list
      * @param element element to add
     * @return true if the element was successfully added
     */
    boolean add(T element);

    /**
     * Remove the element found at the given index from the list
     * @param index position of the element to remove
     * @return true if the element at the given index was successfully removed
     */
    boolean remove(int index);

    /**
     * Retrieve the element at the given index, without removing it from the list
     * @param index position of the element to retrieve
     * @return the element at the specified position in this list
     */
    T get(int index);

    /**
     * Return true if this list contains the specified element
     * @param element whose presence in the list is being tested
     * @return true if the element exists in the list
     */
    boolean contains(T element);

    /**
     * Return the number of elements in the list
     * @return an int representing the number of elements in the list
     */
    int size();


    /**
     * Returns true if the list contains zero elements
     * @return true if the list is empty
     */
    boolean isEmpty();

}
