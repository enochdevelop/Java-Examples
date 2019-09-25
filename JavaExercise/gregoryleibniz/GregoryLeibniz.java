/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gregoryleibniz;

import java.util.Scanner;

/**
 *
 * @author enoch
 */
public class GregoryLeibniz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /*System.out.print("Enter an index for a leibniz pie: ");
        int index = input.nextInt();

        //find and display the next sequence number
        System.out.println("Fpie number at index " + index + " is " + Leib(index));

    }

    private static long Leib(long index) {*/
        
        double n = 1.0;
        int num = 1;
        double amount = 100000.0;
        
        for (double i = 3.0; i <=amount; i= i+2 )
        {
            if (num % 2 == 0)
                n = n + (1/i);
            else
                n = n - (1/i);
            num = num + 1;
            
        }
         System.out.print(4*n);
}
}
