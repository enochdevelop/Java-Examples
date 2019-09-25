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
public class myCircle extends GeometricObject {
    
    //declare variable
  private double radius;

  public myCircle() {
  }

  //radius
  public myCircle(double radius) {
    this.radius = radius;
  }

  /** Return radius */
  public double getRadius() {
    return radius;
  }

  /** Set a new radius */
  public void setRadius(double radius) {
    this.radius = radius;
  }

  @Override /** Return area */
  public double getArea() {
    return radius * radius * Math.PI;
  }

  /** Return diameter */
  public double getDiameter() {
    return 2 * radius;
  }

  @Override /** Return perimeter */
  public double getPerimeter() {
    return 2 * radius * Math.PI;
  }

 @Override
 public String toString() {
     return "Circle: radius = " + radius + " and the area is " + getArea();
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