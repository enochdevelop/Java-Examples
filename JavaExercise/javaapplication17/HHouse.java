/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication17;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author enoch
 */
public class HHouse {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {

        //locates file stored in parameter
        BufferedReader read = new BufferedReader(new FileReader("test.txt"));

        //creates Set interface
        //uses treeSet on the string to figue out whether its unique or not
        Set<String> show = new TreeSet<>();
        

        //for loop to process lines
        for (String line; (line = read.readLine()) != null;) {

            // removes empty string
            String[] words = line.split(" ");

            //for loop to replace commas and quotation marks with blank space
            for (String word : words) {
                String cleanedWord = word.toLowerCase()
                        .replace(",", "")
                        .replace(";", "")
                        .replace("\"", "")
                        .replace("'", "")
                        .replace("", "");
                //adds unique words to the treeSet
                show.add(cleanedWord);

                //prints out count of unique words
                System.out.println(show.size());
                System.out.println(show);
            }
            {
            }

        }
    }
}
