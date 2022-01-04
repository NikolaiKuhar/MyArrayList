package Array;

/**  ArrayList. implementation of basic methods
 *
 * @author Kukhar Nukolai
 * Date: 04.01.2022
 * @param <E> general type
 */

public interface MyArray<E> {
    /**
     * Getting an element by index
     * @param index element index
     * @return returns the element at index
     * @throws IndexOutOfBoundsException checking if an element with such an index
     */
    E get(int index);

    /**
     * Adding an element to the end
     * @param elem the element to be added
     */
    void add(E elem);

    /**
     * Adding an element by index
     * @param elem the element to be added
     * @param index element index
     */
    void add(E elem, int index);

    /**
     * Removing an element
     * @param elem the element to be removed
     */
    void remove(E elem);

    /**
     * Removing an element by index
     * @param index the index of the item to remove
     * @throws IndexOutOfBoundsException checking if an element with such an index
     */
    void remove(int index);

    /**
     * Collection size
     * @return the current size of the collection
     */
    int size();

    /**
     * Inserting an element by index
     * @param elem the element to by inserted
     * @param index the index where we insert the element
     */
    void set(E elem, int index);

    /**
     * Clearing collections from elements
     */
    void clear();

    /**
     * Quciksort of collections
     */
    void quickSort();
}
