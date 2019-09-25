/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semester;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author enoch
 */
public class Semester {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {

        //reads the files
        FileReader file = new FileReader("first.txt");
        Scanner input = new Scanner(file);

        //creates Queue
        Queue<Character> list = new LinkedList<Character>();

        //creates deque
        Deque<Character> list2 = new LinkedList<Character>();

        //creates stack
        Stack<Character> even = new Stack<>();

        //seperates file to single characters
        while (input.hasNext()) {
            String line = input.nextLine();

            for (int i = 0; i < line.length(); i++) {
                list.add(line.charAt(i));
            }

            System.out.println("ORIGINAL SEQUENCE: " + list);

            //creates source variable
            String source = " ";

            //if queue is not empty 
            while (!list.isEmpty()) {

                char num = list.remove();

                //seperate even numbers
                if (num % 2 == 0) {
                    even.add(num);

                } else {
                    //seperate odd numbers
                    list2.add(num);
                }
            }

            //prints out text
            System.out.print("MODIFIED SEQUENCE : ");

            //prints out even numbers in reverse order
            for (int i = (even.size()); i > 0; i--) {

                System.out.print(even.peek());
                even.pop();
            }

            //checks if deque is not empty 
            while (!list2.isEmpty()) {
                //removes the first element and adds to String variable "source"
                source = source + list2.removeFirst();
                //if there is nothing left to graba end
                if (list2.isEmpty()) {
                    break;

                }
                //removes thee last element and adds to String variable "source"
                source = source + list2.removeLast();
            }

            //prtins out source variable
            System.out.println(source);
        }
    }
}
