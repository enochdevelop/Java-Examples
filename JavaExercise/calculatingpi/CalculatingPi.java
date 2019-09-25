/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculatingpi;

/**
 *
 * @author enoch
 */
public class CalculatingPi {

    //global variable
    static double calc;

    public static void main(String[] args) {

        //initates method; adds initial value 1
        System.out.println(LeibnizSeries(1));
    }

    public static double LeibnizSeries(double n) {

        //number of iterations
        if (n >= 7000) {
            return 0;
            
        } else {
            //calculation of pi 
            calc += (4.0 / n) - (4.0 / (n + 2));
        }
        //prints out vlaue
        System.out.println(calc);
        
        //add the inital value of n + 4 to the method 
        return LeibnizSeries(n + 4);
    }
}
