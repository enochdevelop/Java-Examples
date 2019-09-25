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
public class Vehicle {

    public int nbrOfWheels;
    public int nbrOfPassangers;
    public String color;

    @Override
    public String toString() {
        return "This viechle has{" + nbrOfWheels + "carries" + nbrOfPassangers + "and is" + color;
    }

    public int getNbrOfWheels() {
        return nbrOfWheels;
    }

    public void setNbrOfWheels(int nbrOfWheels) {
        this.nbrOfWheels = nbrOfWheels;
    }

    public int getNbrOfPassangers() {
        return nbrOfPassangers;
    }

    public void setNbrOfPassangers(int nbrOfPassangers) {
        this.nbrOfPassangers = nbrOfPassangers;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}

