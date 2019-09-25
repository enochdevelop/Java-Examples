/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citcopy;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author josborne
 */
public class CITCopy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    // Check command-line parameter usage
    if (args.length != 2) { 
      System.out.println(
        "Usage: java CITCopy sourceFile targetfile");
      System.exit(1);
    }

    // Check if source file exists
    File sourceFile = new File(args[0]);
    if (!sourceFile.exists()) {
       System.out.println("Source file " + args[0] 
         + " does not exist");
       System.exit(2);
    }

    // Check if target file exists
    File targetFile = new File(args[1]);
    if (targetFile.exists()) {
      System.out.println("Target file " + args[1] 
        + " already exists");
      System.exit(3);
    }

    try (
      // Create an input stream
      BufferedInputStream input = 
        new BufferedInputStream(new FileInputStream(sourceFile));
  
      // Create an output stream
      BufferedOutputStream output = 
        new BufferedOutputStream(new FileOutputStream(targetFile));
    ) {
      // Continuously read a byte from input and write it to output
      int r, numberOfBytesCopied = 0;
      while ((r = input.read()) != -1) {
        output.write((byte)r);
        numberOfBytesCopied++;
      }

      // Display the file size
      System.out.println(numberOfBytesCopied + " bytes copied");
    }   catch (IOException ex) {
            Logger.getLogger(CITCopy.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
