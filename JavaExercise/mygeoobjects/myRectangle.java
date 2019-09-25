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
public class myRectangle extends GeometricObject {

    private double width;
    private double height;

    public myRectangle() {
    }

    public myRectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    /**
     * Return width
     */
    public double getWidth() {
        return width;
    }

    /**
     * Set a new width
     */
    public void setWidth(double width) {
        this.width = width;
    }

    /**
     * Return height
     */
    public double getHeight() {
        return height;
    }

    /**
     * Set a new height
     */
    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    /**
     * Return area
     */
    public double getArea() {
        return width * height;
    }

    @Override
    /**
     * Return perimeter
     */
    public double getPerimeter() {
        return 2 * (width + height);
    }


    @Override
    public String toString() {
        return "MyRectangle:  width = " + width + " height = " + height + " and the area is " + getArea();
    }
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

    
    

