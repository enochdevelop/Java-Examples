/*
 * enoch ajagbe
 * DataStructures 
 * Program 24.1 
 * 11/19/2017
 * compares the 25 most common words to our unique words 
 */
package hhouse;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class HHouse {

    public static void main(String[] args) throws FileNotFoundException, IOException {

        //locates file stored in parameter
        BufferedReader read = new BufferedReader(new FileReader(args[0]));

        //creates Set interface
        //uses treeSet on the string to figue out whether its unique or not
        TreeMap<String, Integer> show = new TreeMap<>();

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
        //creates a new TreeMap
        TreeMap<String, Integer> common = new TreeMap<String, Integer>();

        //creates an array list to add the 25 common words
        ArrayList<String> CommonWords = new ArrayList<>();

        //adds the 25 common words to the arraylist
        CommonWords.add("the");
        CommonWords.add("be");
        CommonWords.add("to");
        CommonWords.add("of");
        CommonWords.add("and");
        CommonWords.add("a");
        CommonWords.add("in");
        CommonWords.add("that");
        CommonWords.add("have");
        CommonWords.add("i");
        CommonWords.add("it");
        CommonWords.add("for");
        CommonWords.add("not");
        CommonWords.add("on");
        CommonWords.add("with");
        CommonWords.add("he");
        CommonWords.add("as");
        CommonWords.add("you");
        CommonWords.add("do");
        CommonWords.add("at");
        CommonWords.add("this");
        CommonWords.add("but");
        CommonWords.add("his");
        CommonWords.add("by");
        CommonWords.add("from");

        //transfers file to the TreeMap
        for (int i = 0; i < CommonWords.size(); i++) {
            String Words = CommonWords.get(i);
            common.put(Words, 1);
        }
        //puts all the entires into a set
        Set<Map.Entry<String, Integer>> entrySet = show.entrySet();
        Set<Map.Entry<String, Integer>> entrySet2 = common.entrySet();

        //gets the keys and values from each entry
        for (Map.Entry<String, Integer> entry : entrySet) {
            for (Map.Entry<String, Integer> entry2 : entrySet2) {

                //compares the 2 entry sets to see if the values are there if not returns false "equalsIgnoreCase"
                if (entry.getKey().equalsIgnoreCase(entry2.getKey())) {

                    //prints out the values
                    System.out.println(" amount of times each words comes up : " + entry.getValue() + "\t" + " word : " + entry.getKey());

                }
            }

        }
    }
}
