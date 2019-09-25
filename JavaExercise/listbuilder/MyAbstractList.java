/* enoch ajagbe
 * DataStructures 
 * Program 24.1 
 * 11/19/2017
 * Complete the work done in class involving the creation of MyArrayList by implementing the methods
 */
package listbuilder;

public abstract class MyAbstractList<E> implements MyList<E> {

    protected int size = 0; // The size of the list

    /**
     * Create a default list
     */
    protected MyAbstractList() {
    }

    /**
     * Create a list from an array of objects
     */
    protected MyAbstractList(E[] objects) {
        for (int i = 0; i < objects.length; i++) {
            add(objects[i]);
        }
    }

    @Override
    public boolean isEmpty() {
        /*Return true if this list contains no elements */
        return size == 0;
    }

    @Override

    public int size() {
        /*Return the number of elements in this list */
        return size;
    }

    @Override
    public boolean remove(E e) {
        /* Remove the first occurrence of the element e from this list. Shift any
        subsequent elements to the left. Return true if the element is removed. */
        if (indexOf(e) >= 0) {
            remove(indexOf(e));
            return true;
        } else {
            return false;
        }
    }
}
