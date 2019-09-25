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
class Bicycle extends Vehicle {

    public Bicycle() {
        nbrOfWheels = 2;
      
    }
    public Bicycle(int nbrOfPassengers, String color){
        nbrOfWheels = 2;
        this.nbrOfPassangers = nbrOfPassengers;
        this.color = color;
        
    }
    @Override
    public String toString() {
        return "The" + getColor()+ "bicyle has" + getNbrOfWheels()+" wheels and carries" + getNbrOfPassangers() + "passengers";
     }
    }
    

