/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newprogram;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import static jdk.nashorn.tools.ShellFunctions.input;

/**
 *
 * @author enoch
 */
public class NewProgram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {

        BufferedReader show = new BufferedReader(new FileReader("WeHoldTheseTruths.txt"));

        Set<String> set = new HashSet<>();

        for (String line; (line = show.readLine()) != null;) {
            String[] words = line.split(" ");

            for (String word : words) {
                String cleanedWord = word.toLowerCase();
                set.add(cleanedWord);
                System.out.print(set);
            }

        }

    }
}
