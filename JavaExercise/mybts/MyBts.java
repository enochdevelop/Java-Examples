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
public class MyBts {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         BTS<String> tree = new BTS<>();
        tree.insert("Georgia");
        tree.insert("Micheal");
        tree.insert("Tom");
        tree.insert("Adam");
        tree.insert("Jones");
        tree.insert("Peter");
        tree.insert("Daniel");
         System.out.print("Inorder (sorted): ");
        tree.getNumberOfLeaves();
        
        System.out.print("\nPostorder: ");
        tree.postorder();
        System.out.print("\npreorder: ");
        tree.preorder();
        
        System.out.print("\nThe number of nodes is " + tree.getSize());
        
    
    
    System.out.print("\nInorder (sorted): ");
    tree.inorder();
    System.out.print("\nDelete George");
    tree.delete("George");
    System.out.print("\nInorder (sorted): ");
    tree.inorder();
    System.out.print("\nDelete Adam");
    tree.delete("Adam");
    System.out.print("\nInorder (sorted): ");
    tree.inorder();
    System.out.print("\nDelete Michael");
    tree.delete("Michael");
    System.out.print("\nInorder (sorted): ");
    tree.inorder();
    
    
    
    }
    
}
