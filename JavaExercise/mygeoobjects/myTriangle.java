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
public class myTriangle extends GeometricObject {

    //intitate sides
    public myTriangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    
    private double side1;
    private double side2;
    private double side3; 
    

    //finds Side1
    public double getSide1() {
        return side1;
    }

    //rewrites Side1
    public void setSide1(double side1) {
        this.side1 = side1;
    }

    //find Side2
    public double getSide2() {
        return side2;
    }

    //rewrite Side2
    public void setSide2(double side2) {
        this.side2 = side2;
    }

    //find Side3
    public double getSide3() {
        return side3;
    }

    //rewrite Side3
    public void setSide3(double side3) {
        this.side3 = side3;
    }

    //find the Area
    @Override
    public double getArea() {
        
      return (side1 + side2)/2; 
    }

    //Find the Perimeter
    @Override
    public double getPerimeter() {
        return (side1 + side2 + side3);
    
    }
    
    //toString 
     @Override
    public String toString() {
     return "Triangle: Area = " + getArea() + " and the perimeter is " + getPerimeter();
    }
    
    //compareTo method 
    @Override
    public int compareTo(GeometricObject o) {
        if (getArea() > o.getArea()) {
            return 1;
            
        } else if (getArea() < o.getArea()) {   
            return -1;
            
        } else {  
            return 0;
        }
    }

}
       
 
