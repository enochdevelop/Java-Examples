/*
 * enoch ajagbe
 * DataStructures 
 * Program 24.1
 * 11/07/2017
 * outputs a table listing the number of times each word occurs in the input file
 */
package house;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

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
        BufferedReader read = new BufferedReader(new FileReader(args[0]));

        //creates Set interface
        //uses treeSet on the string to figue out whether its unique or not
        Map<String, Integer> show = new TreeMap<>();

        //for loop to process lines
        for (String line; (line = read.readLine()) != null;) {
            //prints out total amount of  words

            // removes empty string
            String[] words = line.split(" ");

            //for loop to replace commas and quotation...etc marks with blank space
            for (String word : words) {
                String cleanedWord = word.toLowerCase()
                        .replace(",", "")
                        .replace(";", "")
                        .replace("\"", "")
                        .replace("-", "")
                        .replace("`", "")
                        .replace("~", "")
                        .replace("!", "")
                        .replace("@", "")
                        .replace("#", "")
                        .replace("$", "")
                        .replace("%", "")
                        .replace("^", "")
                        .replace("*", "")
                        .replace("&", "")
                        .replace("(", "")
                        .replace(")", "")
                        .replace("+", "")
                        .replace("=", "")
                        .replace("_", "")
                        .replace("?", "")
                        .replace("/", "")
                        .replace("|", "")
                        .replace("{", "")
                        .replace("}", "")
                        .replace(":", "")
                        .replace("[", "")
                        .replace("]", "")
                        .replace("", "")
                        .replace("1", "")
                        .replace("2", "")
                        .replace("3", "")
                        .replace("4", "")
                        .replace("5", "")
                        .replace("7", "")
                        .replace("9", "")
                        .replace(".", "");

                //checks for the amount of unique words and counts their occurence
                if (cleanedWord.length() > 0) {
                    //if the key is not already yet it, add it
                    if (!show.containsKey(cleanedWord)) {
                        show.put(cleanedWord, 1);
                    } else {
                        //if the key is in add 1 to the count
                        int value = show.get(cleanedWord);
                        value++;
                        show.put(cleanedWord, value);

                        //prints out total amount of Unique words
                        System.out.println("Amount of unique words: " + show.size());
                    }
                }

            }

        }
        //puts all the entires into a set
        Set<Map.Entry<String, Integer>> entrySet = show.entrySet();
        //gets the keys and values from each entry
        for (Map.Entry<String, Integer> entry : entrySet) {

            //prints out the values
            System.out.println(entry.getValue() + "\t" + entry.getKey());
        }
    }
}

  

