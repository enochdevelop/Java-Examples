/*
 * enoch ajagbe
 * DataStructures 
 * Program 24.1 
 * 11/19/2017
 * Complete the work done in class involving the creation of MyArrayList by implementing the methods
 */
package listbuilder;

import java.util.Iterator;

public class MyArrayList<E> extends MyAbstractList<E> {

    /**States how much data it can hold
     * Universal 
     */
    public static final int INITIAL_CAPACITY = 16;
    private E[] data = (E[]) new Object[INITIAL_CAPACITY];

    public MyArrayList() {

    }

    /* Makes sure there is enough space if not create more
    */
    private void ensureCapacity() {
        if (size >= data.length) {
            E[] newData = (E[]) (new Object[size * 2 + 1]);
            System.arraycopy(data, 0, newData, 0, size);
            data = newData;
        }
    }

    /**
     * Add a new element at the specified index in this list
     */
    @Override
    public void add(int index, E e) {
        ensureCapacity();
        for (int i = size - 1; i >= index; i--) {
            data[i + 1] = data[i];
            data[index] = e;

        }

    }

    /**
     * Add a new element at the end of this list
     */
    public void add(E e) {
        ensureCapacity();
        data[size] = e;
        size++;
    }

    /**
     * Clear the list
     */
    @Override
    public void clear() {
        data = (E[]) new Object[INITIAL_CAPACITY];
        size = 0;
    }

    /**
     * Return true if this list contains the element
     */
    @Override
    public boolean contains(E e) {
        for (int i = 0; i < size; i++) {
            if (e.equals(data[i])) {
                return true;
            }
        }
        return false;
    }

    /**
     * Return the element from this list at the specified index
     */
    @Override
    public E get(int index) {
        checkIndex(index);
        return data[index];
    }

    /*Throws out exception if data values are out of the specified bounds
        
    */
    private void checkIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
    }

    /**
     * Return the index of the first matching element in this list. Return -1 if
     * no match.
     */
    @Override
    public int indexOf(E e) {
        for (int i = 0; i < size; i++) {
            if (e.equals(data[i])) {
                return i;
            }
        }
        return -1;
    }

    /**
     * Return the index of the last matching element in this list Return -1 if
     * no match.
     */
    @Override
    public int lastIndexOf(E e) {
        for (int i = size - 2; i >= 0; i--) {
            if (e.equals(data[i])) {
                return i;
            }
        }

        return -1;

    }

    /**
     * Remove the element at the specified position in this list Shift any
     * subsequent elements to the left. Return the element that was removed from
     * the list.
     */
    @Override
    public E remove(int index) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void trimToSize() {
        if (size != data.length) {
            E[] newData = (E[]) (new Object[size]);
            System.arraycopy(data, 0, newData, 0, size);
            data = newData;
        }//if size == capacity, no need to trim

    }

    /**
     * Replace the element at the specified position in this list with the
     * specified element and returns the new set.
     */
    @Override
    public E set(int index, E e) {
        checkIndex(index);
        E old = data[index];
        data[index] = e;
        return old;
    }

    //honestly i have no idea what this does 
    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("[");

        for (int i = 0; i < size; i++) {
            result.append(data[i]);
            if (i < size - 1) {
                result.append(",");
            }
        }
        return result.toString() + "]";
    }

    //returns element type 
    @Override
    public java.util.Iterator<E> iterator() {
        return new ArrayListIterator();
    }

    
    @Override
    public void add(MyList<E> anotherList) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * removes every occurrence of an element from the list*
     */
    @Override
    public void removeAll(E e) {
        ensureCapacity();
        data[size] = null;

    }

    private class ArrayListIterator
            implements java.util.Iterator<E> {

        private int current = 0;

        @Override
        public boolean hasNext() {
            return (current < size);
        }

        @Override
        public E next() {
            return data[current++];
        }

        @Override
        public void remove() {
            MyArrayList.this.remove(current);
        }
    }
}
