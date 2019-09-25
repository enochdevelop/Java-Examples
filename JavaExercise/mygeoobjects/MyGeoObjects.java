/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mygeoobjects;


/**
 *
 * @author orucitilab
 */
public class MyGeoObjects {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
        //crete and indicate array size
        GeometricObject[] MyNewGeoObj = new GeometricObject[6];
        
        //fill the array creted
        MyNewGeoObj[0] = new myCircle(1);
        MyNewGeoObj[1] = new myCircle(2);
        MyNewGeoObj[2] = new myRectangle(2, 2);
        MyNewGeoObj[3] = new myRectangle(3, 3);
        MyNewGeoObj[4] = new myTriangle(2, 2, 2);
        MyNewGeoObj[5] = new myTriangle(3, 4, 5);
        
        //sort the Objects
        for (int i = 0; i < 6; i++) {
        System.out.println(MyNewGeoObj[i].toString() + " Area: " + MyNewGeoObj[i].getArea());
    }
        //create a MyCircle
        myCircle myNewCircle = new myCircle(5);
        System.out.println(myNewCircle.toString());
        
        //create a myRectangle 
        myRectangle myNewRectangle = new myRectangle(2, 2);
        System.out.println(myNewRectangle.toString());
        
        //create a myTriangle
        myTriangle myNewTriangle = new myTriangle(3, 4, 5);
        System.out.println(myNewTriangle.toString());
        
        //test compareTo method
        int myInt = myNewTriangle.compareTo(myNewRectangle);
        System.out.println(myInt);
        System.out.println();
        
        //sorts array
        java.util.Arrays.sort(MyNewGeoObj);
        
    }
    
}