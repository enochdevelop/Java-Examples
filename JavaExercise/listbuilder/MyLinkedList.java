/*
 * enoch ajagbe
 * DataStructures 
 * Program 24.1 
 * 11/19/2017
 * Complete the work done in class involving the creation of MyArrayList by implementing the methods
 */
package listbuilder;

import java.util.Iterator;


public class MyLinkedList<E> extends MyAbstractList<E> {

     private Node<E> head, tail;

    /**
     * Create a default list
     */
    public MyLinkedList() {
    }

    /**
     * Create a list from an array of objects
     */
    public MyLinkedList(E[] objects) {
        super(objects);
    }
    
    @Override
    public void add(MyList<E> anotherList) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void removeAll(E e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    boolean getFirst() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    boolean getLast() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void addFirst(String b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private class Node<E> {

        E element;
        Node<E> next;

        public Node(E element) {
            this.element = element;
        }
    }


    public void addFrist(E e) {
        Node<E> newNode = new Node<>(e);
        newNode.next = head;
        head = newNode;
        size++;
        if (tail == null) {
            tail = head;
        }
    }

    public void addLast(E e) {
        if (tail == null) {
            head = tail = new Node<>(e);
            tail = tail.next;
        }
        size++;
    }

    @Override
    public void add(E e) {
        addLast(e);

    }

    @Override
    public void add(int index, E e) {
        if (index == 0) {
            addFrist(e);
        } else if (index >= size) {
            addLast(e);
        } else {
            Node<E> current = head;
            for (int i = 1; i < index; i++) {
                current = current.next;
            }
            Node<E> temp = current.next;
            current.next = new Node<>(e);
            (current.next).next = temp;
            size++;
        }
    }

    @Override
    public void clear() {
        head = tail = null;
    }
    
    /**
     * Return true if this list contains the element o
     */
    @Override
    public boolean contains(E e) {
        // Implement it in this exercise
        Node<E> current = head;
        for (int i = 0; i < size; i++) {
            if (current.element.equals(e)) {
                return true;
            }
            current = current.next;
        }

        return false;  
    }
    

    @Override
    public E get(int index) {
        checkIndex(index);
        return data[index];
    }
   

    @Override
    public int indexOf(E e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int lastIndexOf(E e) {
        //implement it in this exercise
       int lastIndex = -1; 
       Node<E> current = head; 
       for (int i = 0; i < size; i++) {
           if (current.element.equals(0)) {
               lastIndex = 1;
           }
           current = current.next;
       }
       return lastIndex; 
    }
   

    public E removeFirst() {
        if (size == 0) {
            return null;
        } else {
            Node<E> temp = head;
            head = head.next;
            size--;
            if (head == null) {
                tail = null;
            }
            return temp.element;
        }
    }
    public E removeLast() {
        if (size == 0) return null;
        else if (size == 1)
        {
            Node<E> temp = head;
            head = tail = null;
            size = 0;
            return temp.element;
        }
        else
        {
            Node<E> current = head;
            for (int i = 0; i < size - 2; i++)
                current = current.next;
            Node<E> temp = tail;
            tail = current;
            tail.next = null;
            size--;
            return temp.element;
        }
    }

    @Override
    public E remove(int index) {
           if (index < 0 || index >= size) 
               return null; 
           else if (index == 0) return removeFirst();
           else if (index == size -1) 
               return removeLast();
           else { 
               Node<E> previous = head;
               for (int i = 1; i < index; i++) {
                   previous = previous.next;
               }
               Node<E> current = previous.next;
               previous.next = current.next;
               size --; 
               return current.element;
           }
    }
    
    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("[");

        Node<E> current = head;
        for (int i = 0; i < size; i++) {
            result.append(current.element);
            current = current.next;
            if (current != null) {
                result.append(", "); // Separate two elements with a comma
            } else {
                result.append("]"); // Insert the closing ] in the string
            }
        }

        return result.toString();
    }

    @Override
    public E set(int index, E e) {
        checkIndex(index);
        E old = data[index];
        data[index] = e;
        return old;
    }
  /**
     * Override the iterator method defined in Iterable
     */
    public java.util.Iterator<E> iterator() {
        return new LinkedListIterator();
    }

    private class LinkedListIterator
            implements java.util.Iterator<E> {

        private Node<E> current = head; // Current index 

        public boolean hasNext() {
            return (current != null);
        }

        public E next() {
            E e = current.element;
            current = current.next;
            return e;
        }

        public void remove() {
            System.out.println("Implementation left as an exercise");
        }
    }

}

