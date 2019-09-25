/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package roadrage;

/**
 *
 * @author enoch
 */
class Car extends Vehicle implements Engine {

    @Override
    public String toString() {
        return "Car{" + "isRunning=" + isRunning + ", fuelType=" + fuelType + ", isAutomatic=" + isAutomatic + '}';
    }
    
    boolean isRunning;
    String fuelType;
    boolean isAutomatic; 

    Car(String fuelType, boolean isAutomatic, int i, String blue) {
        
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public void setIsAutomatic(boolean isAutomatic) {
        this.isAutomatic = isAutomatic;
    }

    public boolean isIsRunning() {
        return isRunning;
    }

    public String getFuelType() {
        return fuelType;
    }

    public boolean isIsAutomatic() {
        return isAutomatic;
    }
    
    @Override
    public void stopEngine() {
        isRunning = false;
    }
    
    @Override
    public void startEngine() {
        isRunning = true;
   
    }
    public Car(boolean isRunning, String fuelType, boolean isAutomatic) {
        this.isRunning = isRunning;
        this.fuelType = fuelType;
        this.isAutomatic = isAutomatic;
    }

    @Override
    public boolean checkRunning() {
        return isRunning; 
    }
    
}
