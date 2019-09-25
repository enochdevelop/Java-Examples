/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testcomparator;

/**
 *
 * @author enoch
 */
public class Testcomparator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        
        GeometricObject g1 = new myRectangle(3, 2);
        GeometricObject g2 = new myCircle(1);
        GeometricObject g3 = new myTriangle(3, 4, 5);
        GeometricObject g4 = new myRectangle(3, 2); 
        
        System.out.println("Area of rectangle g1 is: " +g1.getArea());
        System.out.println("Area of cirlce g2 is: " +g2.getArea());
        System.out.println("Area of triangle g3 is: " +g3.getArea());
        System.out.println("Area of rectangle g4 is: " +g4.getArea());
        
        //Use the comparator straight out of the box
        GeometricObjectComparator myComparator = new GeometricObjectComparator();
        System.out.println("myComparator.compare(g1,g2) = " + myComparator.compare(g1, g2));
        
    }
    
}
