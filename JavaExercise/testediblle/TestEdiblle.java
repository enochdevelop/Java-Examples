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
public class TestEdiblle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Object[] objects = {/*new Chicken(),*/new Tiger(), new Cherry(), new PricklyPear()};

        for (int i = 0; i < objects.length; i++) {

            //clarifies if object is Edible
            if (objects[i] instanceof Edible) //prints objects
            {
                System.out.println(((Edible) objects[i]).howtoEat());
            }

            /*if (objects[i] instanceof Animal) {
             
                System.out.println(((Animal)objects[i]).sound()); */
            //clarifies if object is a Fruit    
            if (objects[i] instanceof Fruit) {

                //prints object
                System.out.println(((Fruit) objects[i]).getisGrownOn());

                //prints objetc
                System.out.println(((Fruit) objects[i]).howGrown());
            }
        }

    }
}
