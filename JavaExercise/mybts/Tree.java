/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mybts;

/**
 *
 * @author enoch
 */
public interface Tree<E> extends Iterable<E> {

    //returns time if the emelent is in the tree
    public boolean search(E e);

    //deletes the specified elemet forn the tree
    //returns true if the ement is deleted succesffully 
    public boolean insert(E e);

    
    public boolean delete(E e);

    //inorder transversal from the root
    public void inorder();

    //postorder transversal from the roots
    public void postorder();

    //preorder transversal from the roots
    public void preorder();

    public int getSize();

    //return true of the tree is empty
    public boolean isEmpty();
    
    //return number of nodes
    public int getNumberOfLeaves();
    

}
