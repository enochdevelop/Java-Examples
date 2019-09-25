/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gregory;


/**
 *
 * @author enoch
 */
public class Gregory {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(LeibnizSeries(1));
   
 
    }

    public static double LeibnizSeries(double num) {

        //double n = 1.0;
       // double calculation = (4.0 /n - (4.0/n+2));
        
        double value=5;
        if (num == 5) 
            return 0;
        else 
            return value;//(4.0 /num+4) - (4.0/num+2);
        }
    }

       
    
       /* double n = 1.0;
        double i = 3.0;
        int index = 0;
        
        
      if (index % 2 == 0) {
            return (long)(n  + (1 / i));

        } else if (index % 2 == 1) {
            return (long)(n - (1 / i));
        }
        //System.out.println(4 * n);
        return fib((long) (4 *n));
    }

    

}
*/