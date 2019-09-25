/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author enoch
 */
public class Test {


    public static void main(String[] args) throws FileNotFoundException, IOException {
        // TODO code application logic here
        //code to read a file
        //lunching file reader
        FileReader fr = new FileReader("first.txt");
        Scanner fileinput = new Scanner(fr); //used scanner
        //System.out.print("Enter a given series of number: " );
        //Creating array for chars 
        ArrayList<Character> al = new ArrayList<>();

        //Queue<String> q = new LinkedList<>();
        //System.out.print("ORIGINAL SEQUENCE: ");
        while (fileinput.hasNextLine()) {
            Stack<String> st = new Stack<>();
            Stack<String> st1 = new Stack<>();
            //printing the output for original sequence 
            System.out.print("ORIGINAL SEQUENCE: ");
            String numbers = fileinput.nextLine();
            //making the numbers print to next line 
            System.out.print(numbers + "\n");
            try {
                //code to push stacks to the right place
                for (int i = 0; i < numbers.length(); i++) {
                    al.add(numbers.charAt(i));
                    if (al.get(i) % 2 == 0) {
                        st.push(al.get(i).toString());
                    } else {
                        st1.push(al.get(i).toString());
                    }
                }
//printing the modified sequence
                System.out.print("MODIFIED SEQUENCE: ");
                for (int i = (st.size()); i > 0; i--) {
                    System.out.print(st.peek());
                    st.pop();

                    if (st.isEmpty()) {
                        for (int j = st1.size() - 1; j > 0; j--) {
                            if (!st1.isEmpty()) {
                                System.out.print(st1.firstElement());
                                st1.remove(0);
                                System.out.print(st1.lastElement());
                                st1.remove((st1.size() - 1));
                            }
                        }
                    }
                }
                //catching the exception
            } catch (Exception e) {

            }
//closing the file after it as been used
            System.out.print("\n");
        }

        fileinput.close();

    }
}
