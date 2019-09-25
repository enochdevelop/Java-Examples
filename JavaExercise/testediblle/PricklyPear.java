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
public class PricklyPear extends Fruit implements Edible {

    public PricklyPear() {
        isGrownOn = "PricklyPear : A pear tree";
    }

    //find the isGrownOn variable
    @Override
    public String getisGrownOn() {
        return isGrownOn;
    }

    //rewrites and sets isGrownOn value
    public void setIsGrownOn(String isGrownOn) {
        this.isGrownOn = isGrownOn;
    }

    //adds value to howGrown method
    @Override
    public String howGrown() {
        return "PricklyPear : A Seed is Planted"; //To change body of generated methods, choose Tools | Templates.
    }

    //adds value to howtoEat method
    @Override
    public String howtoEat() {
        return "PricklyPear : Raw, Sliced up, ...etc"; //To change body of generated methods, choose Tools | Templates.
    }

}
