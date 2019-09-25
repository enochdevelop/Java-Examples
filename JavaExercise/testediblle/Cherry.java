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
public class Cherry extends Fruit implements Edible {

    public Cherry() {

        //adds value to the isGrownOn method 
        isGrownOn = "Cherry : A Cherry tree";
    }

    //find the isGrownOn variable
    @Override
    public String getisGrownOn() {
        return isGrownOn;
    }

    //adds value to howGrown method
    @Override
    public String howGrown() {
        return "Cherry : A Seed planted in the ground "; //To change body of generated methods, choose Tools | Templates.
    }

    //adds value to howtoEat method
    @Override
    public String howtoEat() {
        return "Cherry : IceCream, Raw, etc..."; //To change body of generated methods, choose Tools | Templates.
    }

    //rewrites and sets isGrownOn value
    @Override
    public void setisGrownOn(String isGrownOn) {
        this.isGrownOn = isGrownOn;
    }

}
