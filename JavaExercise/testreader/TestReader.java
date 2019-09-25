/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testreader;

import java.io.*;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author enoch
 */
public class TestReader {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            
        // TODO code application logic here
        
        //creating a new file object
        Element newElement; 
        ObjectOutputStream element = null;
        
        try {
            
            try {
            ObjectOutputStream elementOut = new ObjectOutputStream(new FileOutputStream (new File("Elements.dat")));
         
            //create an Arraylist of Element 
            ArrayList<Element> elementArray = new ArrayList<>();
            
            //create some element
            elementArray.add(new Element("Hydrogen", "H", 1, 1.0078));
            elementArray.add(new Element("Oxygen", "O", 16, 15.999));
            elementArray.add(new Element("Carbon", "C", 6, 12.011));
            
            //write element to file
            elementOut.writeObject(elementArray.get(0));
            elementOut.writeObject(elementArray.get(1));
            elementOut.writeObject(elementArray.get(2));
            elementOut.flush();
            elementOut.close();
       
            //creare an ObjectInputStream for the file we created before 
            ObjectInputStream elementln = new ObjectInputStream(new FileInputStream(new File("Elements.dat")));

            //Read Objects from file
            while ((newElement = (Element) elementln.readObject()) != null) {
                System.out.println("Element: " + newElement.getSymbol() * " is " 
                        + newElement.getName() + "" + "which has an atomoicnumber of " 
                        + newElement.getAtomicNumber() + " and atomic weight of "
                        + newElement.getAtomicWeight());
            }
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(TestReader.class.getName()).log(Level.SEVERE, null, ex);
        }
        } catch (IOException ex) {
            Logger.getLogger(TestReader.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
