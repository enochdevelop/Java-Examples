/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testediblle;

/**
 *
 * @author enoch
 */
public abstract class Fruit {
    
    //create string variable 
    String isGrownOn;
    
    //creates abstract string variable 
    public abstract String howGrown();

    //get isGrownOn variable 
    public String getisGrownOn() {
        return isGrownOn;
    }

    //instanciate setter method for isGrownOn
    public void setisGrownOn(String isGrownOn) {
        this.isGrownOn = isGrownOn;
    }
    

}
