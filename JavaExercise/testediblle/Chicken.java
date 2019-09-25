/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testediblle;

/**
 *
 * @author orucitilab
 */
public class Chicken extends Animal implements Edible {
    
    //implements/prioritize sound
    @Override
    public String sound() {
        return "Chicken: cock-a-doodle-do"; 
    }

    @Override
    public String howtoEat() {
        return "Chicken: Bread and Fry it!"; 
    }
    
}
