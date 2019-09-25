/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testmyqueue;

import java.util.LinkedList;




/**
 *
 * @author enoch
 */
public class MyQueue<E> {

    private LinkedList<E> myQueue = new LinkedList<>();

    public void enqueue(E e) {
        myQueue.addLast(e);
    }

    public E dequeue() {
        return myQueue.removeFirst();
    }

    public int getSize() {
        return myQueue.size();

    }

    @Override
    public String toString() {
        

    }
}
