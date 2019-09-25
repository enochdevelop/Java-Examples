/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testmystack;

/**
 *
 * @author enoch
 */
public class TestMyStack {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       MyStacks<String> Stack = new MyStacks<>();
       
       
       Stack.push("First");
       Stack.push("Second");
       Stack.push("Third");
       Stack.push("Fourth");
       
       System.out.println("Stack size is: " + Stack.getSize());
       
    }
    
}
