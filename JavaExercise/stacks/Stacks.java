/*
 * enoch ajagbe
 * DataStructures 
 * Program 20.1 
 * 11/19/2017
 * tests and compares perfomance time
 */
package stacks;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Vector;

/**
 *
 * @author enoch
 */
public class Stacks {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws UnknownHostException {
        Scanner input = new Scanner(System.in);

        //request a input from user
        System.out.println("Enter length of array list:");

        //stores input
        int a = input.nextInt();

        //prints out name of machine
        System.out.println("Results from " + InetAddress.getLocalHost().getHostName() + " Using " + a + " Inserts ");

        //randomizes the insert requested by the user
        int[] random = new int[a];
        for (int i = 0; i < a; i++) {
            random[i] = (int) (Math.random() * 100);

        }

        //100% Array List Calculation
        //creates ArrayList for the inserts
        ArrayList<Object> num = new ArrayList<>();
        //stores starting time
        final long startTime = System.currentTimeMillis();

        //100% the number specified by the user in sequential inserts(adds)
        for (int i = 0; i < random.length; i++) {
            num.add(random[i]);
        }

        //loop for timer
        for (int i = 0; i < 10000000; i++) {
            int x = 4;
            x++;
        }
        //stores ending time
        final long endTime = System.currentTimeMillis();
        //long elapsedTime = startTime - endTime;

        //calculates resulting time and stores in a variable
        long Arraytime = endTime - startTime;

        /*50% front/head insers*/
        //clones the array list of the 100% inserts
        ArrayList<Object> num1 = (ArrayList<Object>) (num.clone());
        //stores begining time
        final long startTime1 = System.currentTimeMillis();

        //calculates 50% of the number specified by the user in front/head inserts
        for (int i = 0; i < random.length / 2; i++) {
            num1.add(0, random[i]);
        }
        //loop for timer
        for (int i = 0; i < 10000000; i++) {
            int x = 4;
            x++;
        }
        //stores ending time
        final long endTime1 = System.currentTimeMillis();
        //calculates resulting time and stores in a variable
        long Arraytime1 = endTime1 - startTime1;

        /* 50% rear/tail Array List Calculation*/
        // stores begining time
        final long startTime2 = System.currentTimeMillis();
        //calculates 50% of the number specified by the user in rear/tail inserts
        for (int i = 0; i < random.length / 2; i++) {
            num1.add(random[i]);
        }
        //loop for timer
        for (int i = 0; i < 10000000; i++) {
            int x = 4;
            x++;
        }
        //stores ending time
        final long endTime2 = System.currentTimeMillis();
        //calculates resulting time and stores in a variable
        long Arraytime2 = endTime2 - startTime2;

        /*50% random positions*/
        //stores beginning time
        final long startTime3 = System.currentTimeMillis();

        //calculates 50% of the number specified in random positions
        for (int i = 0; i < random.length / 2; i++) {
            num1.add((int) (Math.random() * num1.size()), (int) Math.random() * 100);
        }

        //loop for timer
        for (int i = 0; i < 10000000; i++) {
            int x = 4;
            x++;
        }
        //stores ending time
        final long endTime3 = System.currentTimeMillis();
        //calculates resulting time and stores in a variable
        long Arraytime3 = endTime3 - startTime3;

        /* 100% random position*/
        //calculates beginning time        
        final long startTime4 = System.currentTimeMillis();
        //calculates 100% inserts into random positions
        for (int i = 0; i < random.length; i++) {
            num1.get((int) (Math.random() * num1.size() - 1));
        }
        //loop for timer
        for (int i = 0; i < 10000000; i++) {
            int x = 4;
            x++;
        }
        //stores ending time
        final long endTime4 = System.currentTimeMillis();

        //calculates resulting time and stores in a variable
        long Arraytime4 = endTime4 - startTime4;

        /*25% deletion from rear*/
        //stores beginning time
        final long startTime5 = System.currentTimeMillis();
        //calculates 25% of the user unserts to delete from rear
        for (int i = 0; i < random.length / 4; i++) {
            num1.remove(num1.size() - 1);
        }
        //loop for timer
        for (int i = 0; i < 10000000; i++) {
            int x = 4;
            x++;
        }
        //stores ending time
        final long endTime5 = System.currentTimeMillis();

        //calculates resulting time and stores in a variable
        long Arraytime5 = endTime5 - startTime5;

        /*25% front*/
        //calculates and stores beginning time
        final long startTime6 = System.currentTimeMillis();
        //calculates 25% to be deleted from front
        for (int i = 0; i < random.length / 4; i++) {
            num1.remove(0);
        }
        //loop for time 
        for (int i = 0; i < 10000000; i++) {
            int x = 4;
            x++;
        }
        //stores ending time
        final long endTime6 = System.currentTimeMillis();
        //calculates resulting time and stores in a variable
        long Arraytime6 = endTime6 - startTime6;

        /*25% random positions deletion*/
        //stores beginning time
        final long startTime7 = System.currentTimeMillis();
        //calculates 25% to be deleted from random positions
        for (int i = 0; i < random.length / 4; i++) {
            num1.remove((int) (Math.random() * num1.size() - 1));
        }
        //loop for time
        for (int i = 0; i < 10000000; i++) {
            int x = 4;
            x++;
        }
        //stores ending time
        final long endTime7 = System.currentTimeMillis();
        //calculates resulting time and stores in a variable
        long Arraytime7 = endTime7 - startTime7;

        /*Linked List*/
        LinkedList<Object> rum = new LinkedList<>();

        //100% the number specified by the user in sequential inserts(adds)
        for (int i = 0; i < random.length; i++) {
            rum.add(random[i]);
        }
        //stores beginning time
        final long Starttime = System.currentTimeMillis();

        //loop for time
        for (int i = 0; i < 10000000; i++) {
            int x = 4;
            x++;
        }
        //stores ending time
        final long Endtime = System.currentTimeMillis();
        //calculates resulting time and stores in a variable
        long Linkedtime = Endtime - Starttime;

        /* 50% front*/
        //stores beginning time
        final long Starttime1 = System.currentTimeMillis();
        //creates LinkedList for the inserts
        LinkedList<Object> rum1 = (LinkedList<Object>) (rum.clone());
        //calculates 50% number specified by the user in front/head inserts
        for (int i = 0; i < random.length / 2; i++) {
            rum1.add(0, random[i]);
        }
        //loop for time
        for (int i = 0; i < 10000000; i++) {
            int x = 4;
            x++;
        }
        //stores ending time
        final long Endtime1 = System.currentTimeMillis();
        //calculates resulting time and stores in a variable
        long Linkedtime1 = Endtime1 - Starttime1;

        /* 50% rear*/
        //stores beginning time
        final long Starttime2 = System.currentTimeMillis();
        //calculates 50% of user inserts to the rear
        for (int i = 0; i < random.length / 2; i++) {
            rum1.add(random[i]);
        }
        //loop for time
        for (int i = 0; i < 10000000; i++) {
            int x = 4;
            x++;
        }
        //stores ending time
        final long Endtime2 = System.currentTimeMillis();
        //calculates resulting time and stores in a variable
        long Linkedtime2 = Endtime2 - Starttime2;

        /*50% random position*/
        //stores beginning time
        final long Starttime3 = System.currentTimeMillis();
        //calculates 50% os user inserts into random positions
        for (int i = 0; i < random.length / 2; i++) {
            rum1.add((int) (Math.random() * rum1.size()), (int) Math.random() * 100);
        }
        //loop for time
        for (int i = 0; i < 10000000; i++) {
            int x = 4;
            x++;
        }
        //stores ending time
        final long Endtime3 = System.currentTimeMillis();
        //calculates resulting time and stores in a variable
        long Linkedtime3 = Endtime3 - Starttime3;

        /*100% random position*/
        //stores beginning time
        final long Starttime4 = System.currentTimeMillis();
        //calculates 100% inserts into random positions
        for (int i = 0; i < random.length; i++) {
            rum1.get((int) (Math.random() * rum1.size() - 1));
        }
        //loop for time
        for (int i = 0; i < 10000000; i++) {
            int x = 4;
            x++;
        }
        //stores ending time
        final long Endtime4 = System.currentTimeMillis();
        //calculates resulting time and stores in a variable
        long Linkedtime4 = Endtime4 - Starttime4;

        /*25% deletion rear*/
        //calculates beginning time
        final long Starttime5 = System.currentTimeMillis();
        //calculates 25% of inserts to be deleted from rear
        for (int i = 0; i < random.length / 4; i++) {
            rum1.remove(rum1.size() - 1);
        }
        //loop for time
        for (int i = 0; i < 10000000; i++) {
            int x = 4;
            x++;
        }
        //stores ending time
        final long Endtime5 = System.currentTimeMillis();
        //calculates resulting time and stores in a variable
        long Linkedtime5 = Endtime5 - Starttime5;

        /*25% front deletion*/
        //stores beginning time
        final long Starttime6 = System.currentTimeMillis();
        //calculates 25% to be deleted from front
        for (int i = 0; i < random.length / 4; i++) {
            rum1.remove(0);
        }
        //loop for time
        for (int i = 0; i < 10000000; i++) {
            int x = 4;
            x++;
        }
        //stores ending time
        final long Endtime6 = System.currentTimeMillis();
        //calculates resulting time and stores in a variable
        long Linkedtime6 = Endtime6 - Starttime6;

        /* 25% random position deletion*/
        //stores beginning time
        final long Starttime7 = System.currentTimeMillis();
        //calculates 25% to be deleted from random positions
        for (int i = 0; i < random.length / 4; i++) {
            rum1.remove((int) (Math.random() * rum1.size() - 1));
        }
        //loop for time
        for (int i = 0; i < 10000000; i++) {
            int x = 4;
            x++;
        }
        //stores ending time
        final long Endtime7 = System.currentTimeMillis();
        //calculates resulting time and stores in a variable
        long Linkedtime7 = Endtime7 - Starttime7;

        /*100% Vector List*/
        Vector<Object> fum = new Vector<>();
        //stores beginning time
        final long Start = System.currentTimeMillis();
        //calculates 100% inserts in sequential inserts (adds);
        for (int i = 0; i < random.length; i++) {
            fum.add(random[i]);
        }

        //loop for time
        for (int i = 0; i < 10000000; i++) {
            int x = 4;
            x++;
        }
        //calculates ending time
        final long End = System.currentTimeMillis();
        //calculates resulting time and stores in a variable
        long Vectortime = End - Start;

        /*50% vector front/head*/
        //calculates beginning time
        final long Start1 = System.currentTimeMillis();
        //creates duplicate of initial vector list to prevent inserts modification
        Vector<Object> fum1 = (Vector<Object>) (fum.clone());
        //calculates 50% of inserts specified by user to front/head insners
        for (int i = 0; i < random.length / 2; i++) {
            fum1.add(0, random[i]);
        }
        //loop for time
        for (int i = 0; i < 10000000; i++) {
            int x = 4;
            x++;
        }
        //calculates ending time
        final long End1 = System.currentTimeMillis();
        //calculates resulting time and stores in a variable
        long Vectortime1 = End1 - Start1;

        /*50% vector rear/tail*/
        //stores beginning time
        final long Start2 = System.currentTimeMillis();
        //calculates 50% inserts to the reat/tail
        for (int i = 0; i < random.length / 2; i++) {
            fum1.add(random[i]);
        }
        //loop for time
        for (int i = 0; i < 10000000; i++) {
            int x = 4;
            x++;
        }
        //sotres ending time
        final long End2 = System.currentTimeMillis();
        //calculates resulting time and stores in a variable
        long Vectortime2 = End2 - Start2;

        /*50% vector random position*/
        //calculates beginning time
        final long Start3 = System.currentTimeMillis();
        //calculates 50% inserts to random positions
        for (int i = 0; i < random.length / 2; i++) {
            fum1.add((int) (Math.random() * fum1.size()), (int) Math.random() * 100);
        }
        //loop for time
        for (int i = 0; i < 10000000; i++) {
            int x = 4;
            x++;
        }
        //stores endining time
        final long End3 = System.currentTimeMillis();
        //calculates resulting time and stores in a variable
        long Vectortime3 = End3 - Start3;

        /*100% vector random positon*/
        //stores beginning time
        final long Start4 = System.currentTimeMillis();
        //calculates 100% inserts into random positions 
        for (int i = 0; i < random.length; i++) {
            fum1.get((int) (Math.random() * fum1.size() - 1));
        }
        //loop for time
        for (int i = 0; i < 10000000; i++) {
            int x = 4;
            x++;
        }
        //stores ending time
        final long End4 = System.currentTimeMillis();
        //calculates resulting time and stores in a variable
        long Vectortime4 = End4 - Start4;

        /*25% vector deletion*/
        //stores begnning time
        final long Start5 = System.currentTimeMillis();
        //calculates 25% inserts to be deleted from rear
        for (int i = 0; i < random.length / 4; i++) {
            fum1.remove(fum1.size() - 1);
        }
        //loop for time
        for (int i = 0; i < 10000000; i++) {
            int x = 4;
            x++;
        }
        //stores ending time
        final long End5 = System.currentTimeMillis();
        //calculates resulting time and stores in a variable
        long Vectortime5 = End5 - Start5;

        /*25% vector front/head*/
        //stores beginning time
        final long Start6 = System.currentTimeMillis();
        //calculates 25% inserts to be deleted from front
        for (int i = 0; i < random.length / 4; i++) {
            fum1.remove(0);
        }
        //loop for time
        for (int i = 0; i < 10000000; i++) {
            int x = 4;
            x++;
        }
        //stores ending variable
        final long End6 = System.currentTimeMillis();
        //calculates resulting time and stores in a variable
        long Vectortime6 = End6 - Start6;

        /*25% random position*/
        //stores beginning time
        final long Start7 = System.currentTimeMillis();
        //calculates 25% to be deleted from random positions
        for (int i = 0; i < random.length / 4; i++) {
            fum1.remove((int) (Math.random() * fum1.size() - 1));
        }
        //loop for time
        for (int i = 0; i < 10000000; i++) {
            int x = 4;
            x++;
        }
        //stores ending time
        final long End7 = System.currentTimeMillis();
        //calculates resulting time and stores in a variable
        long Vectortime7 = End7 - Start7;
        
        //header for the 3 Lists
        System.out.println("     " + "   ArrayList   " + "  " + "VectorList" + "   " + " linkedList");
        //stores times recorded into multi dimensional arrays 
        long one[][] = {{Arraytime, Linkedtime, Vectortime}};
        long two[][] = {{Arraytime1, Linkedtime1, Vectortime1}};
        long three[][] = {{Arraytime2, Linkedtime2, Vectortime2}};
        long four[][] = {{Arraytime3, Linkedtime3, Vectortime3}};
        long five[][] = {{Arraytime4, Linkedtime4, Vectortime4}};
        long six[][] = {{Arraytime5, Linkedtime5, Vectortime5}};
        long seven[][] = {{Arraytime6, Linkedtime6, Vectortime6}};
        long eight[][] = {{Arraytime7, Linkedtime7, Vectortime7}};
        
        //prints out the multidimensional arrays
        System.out.print("Seq Add" + "    ");
        display(five);
        System.out.print("Front Add" + "    ");
        display(two);
        System.out.print("Rear Add" + "    ");
        display(three);
        System.out.print("Random Add" + "    ");
        display(four);
        System.out.print("Random Get" + "    ");
        display(five);
        System.out.print("Random Del" + "    ");
        display(six);
        System.out.print("Front Del" + "    ");
        display(seven);
        System.out.print("Random Del" + "    ");
        display(eight);

    }
    //method for displaying the multidimensional array
    public static void display(long x[][]) {
        //for loop for variables placement in rows
        for (int row = 0; row < x.length; row++) {
            //for loop for variables placement in colums
            for (int column = 0; column < x[row].length; column++) {
                //prints out results
                System.out.print(x[row][column] +"      \t    ");
            }
            System.out.println();
        }
    }
}
