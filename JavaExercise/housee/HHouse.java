/*
 * enoch ajagbe
 * DataStructures 
 * Program 24.1
 * 11/07/2017
 * outpus amount of unique words in a file 
 */
package housee;

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
        BufferedReader read = new BufferedReader(new FileReader(args[0]));

        //creates Set interface
        //uses treeSet on the string to figue out whether its unique or not
        Set<String> show = new TreeSet<>();
        

        //for loop to process lines
        for (String line; (line = read.readLine()) != null;) {

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
                        
                //adds unique words to the treeSet
                show.add(cleanedWord);

                //prints out count of unique words
                System.out.println("unique words:" + show.size());
                //System.out.println(show);
            }
        }
    }
}
            
         