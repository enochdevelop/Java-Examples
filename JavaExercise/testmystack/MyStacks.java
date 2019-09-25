/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testmystack;

import java.util.ArrayList;

/**
 *
 * @author enoch
 */
public class MyStacks<E> {
    
    
    private ArrayList<E> myStack = new ArrayList<>(); {
    
}
    
    public MyStacks(){
        
    }
            
    public int getSize(){
         
        return myStack.size();
    }
            
    public E peek(){
    return myStack.get(getSize() -1);
        
    }
            
    public void push(E o){
    myStack.add(o);
        
    }
            
    public E pop(){
    E o = myStack.get(getSize() -1);
    myStack.remove(getSize() -1);
    return o;
        
    }
            
    public boolean isEmpty(){
    return myStack.isEmpty();
        
    }
    
    @Override 
    public String toString(){
        return "stack: " + myStack.toString();
        
    }       
    
}
