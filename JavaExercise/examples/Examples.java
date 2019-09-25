/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examples;

/**
 *
 * @author enoch
 */
public class Examples {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("The sum is" + " " + xMethod(1234567));
    }
    public static int xMethod(int n) {
        if (n > 0 ) {
            System.out.print( n % 10);
             xMethod(n/10);
        }
        
       
}
}
