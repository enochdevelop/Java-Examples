/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package computerfactorial;

import java.util.Scanner;

public class ComputerFactorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.print("Enter a non-negative integer: ");
       int number = input.nextInt();
       
       //Display factorial
       for (long i = 0; i <= number; i++) {
           System.out.println("Factorial of" + i + " is " + factorial(i));
           
       }
    }
    
    public static long factorial(long n) {
        if (n == 0) // Base case
        {
            return 1;
        }  else {
            return n * factorial( n -1); //Recursive call
        }
    }
    
}
