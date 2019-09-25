/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package computerfibonacci;

import java.util.Scanner;

/**
 *
 * @author enoch
 */
public class Computerfibonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //create a scanner
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an index for a fibonacci number: ");
        int index = input.nextInt();

        //find and display the Fibonnaci number
        System.out.println("Fibonacci number at index " + index + " is " + fib(index));
    
        
    }
    
    
    //the method for finding the Fibonacci number
    private static long fib(long index) {
        if (index == 0) { 
            return 0;
        } else if (index == 1) {
        
            return 1;
        } else { 
        return fib(index -1) + fib(index - 2);
    
    }
    }
    
   
}
