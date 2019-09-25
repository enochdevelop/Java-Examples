/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testdatastream;

/**
 *
 * @author enoch
 */

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TestDataStream {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        try 
        {
            DataOutputStream output = new DataOutputStream (new FileOutputStream("test.dat"));
            
            // Wrtie student test scores to the file
            
            output.writeUTF("John");
            output.writeInt(Integer.MAX_VALUE);
            output.writeUTF("Jim");
            output.writeInt(128);
            output.writeUTF("George");
            output.writeDouble(128.0);
            output.writeChar('T');
            output.writeChar('H');
            output.writeChar('E');
            output.writeChar('N');
            output.writeChar('D');
        
        } catch  (IOException ex) {
            Logger.getLogger(TestDataStream.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        try //create an input stream for file temp.dat
        {
            
            DataInputStream input = new DataInputStream(new FileInputStream("test.dat"));
            
            // read student test scores from the file
            
            System.out.println(input.readUTF() + "" + input.readInt());
            System.out.println(input.readUTF() + "" + input.readInt());
            System.out.println(input.readUTF() + "" + input.readDouble());
            input.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(TestDataStream.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(TestDataStream.class.getName()).log(Level.SEVERE, null, ex);
        }      
                
    }
    
}
