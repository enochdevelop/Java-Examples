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
public class TestBTS {
    public static void main(String[] args ) {
        
        //create a BTS
        BTS<String> tree = new BTS<>();
        tree.insert("Geroge");
        tree.insert("Michael");
        tree.insert("Tom");
        tree.insert("Adam");
        tree.insert("Jones");
        tree.insert("Peter");
        tree.insert("Daniel");
        
        //Travel tree
        System.out.print("Inorder (sorted) : ");
        tree.inorder();
        System.out.print("\nPostorder: ");
        tree.postorder();
        System.out.print("\nPreorder: ");
        tree.preorder();
        
        //get Tree size
        System.out.print("\n There number of nodes is " + tree.getSize());
        
        //Search for an element
        System.out.print("\nIs Peterin the tree? " + tree.search("Peter"));
        
    }
}
