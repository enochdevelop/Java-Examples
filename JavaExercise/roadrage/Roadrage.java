/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package roadrage;

/**
 *
 * @author enoch
 */
public class Roadrage {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Bicycle myBike = new Bicycle (2, "red");
        System.out.println(myBike.toString());
        
        Car myCar = new Car("gas", true, 6, "blue");
        System.out.println(myCar.toString());
    }
    
}
