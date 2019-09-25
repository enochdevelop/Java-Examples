/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testfilestream;

import java.io.*;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author enoch
 */
public class TestFileStream {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {

        // create an output stream to the file
        try {
            FileOutputStream output = new FileOutputStream("temp.dat");

            //Output value to the file
            for (int i = 1; i <= 10; i++) {
                output.write(i);
            }
            output.close();
        } catch (IOException ex) {
            Logger.getLogger(TestFileStream.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            // create an input stream for the file 
            FileInputStream input = new FileInputStream("temp.dat");

            //read values from the file
            int value;
            while ((value = input.read()) != -1) {
                System.out.print(value + " ");

            }
            input.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(TestFileStream.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(TestFileStream.class.getName()).log(Level.SEVERE, null, ex);

        }
    }
}
