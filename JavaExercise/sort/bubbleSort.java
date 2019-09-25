
package sort;

/**
 *
 * @author enoch
 * Data Stucture
 */
public class bubbleSort {
    
    
     public static void bubble(int[] list){
         boolean pass = true; 
         
         for (int k =1; k < list.length && pass; k++) {
         //if sorted ignore
             pass = false;
             
             for (int i =0; i < list.length - k; i++) {
                 if (list [i] > list[i + 1]) {
                     
                     int temp = list[i];
                     list[i] = list[i + 1];
                     list[i + 1] = temp; 
                     
                     pass = true; 
                 }
             }
         }
     }
    
}
