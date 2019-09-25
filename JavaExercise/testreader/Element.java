/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestReader;

import java.io.Serializable;

/**
 *
 * @author josborne
 */
public class Element implements Serializable {

    private String name;
    private String symbol;
    private int atomicNumber;
    private double atomicWeight;

    public Element() {
    }

    public Element(String name, String symbol, int atomicNumber, double atomicWeight) {
        this.name = name;
        this.symbol = symbol;
        this.atomicNumber = atomicNumber;
        this.atomicWeight = atomicWeight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public int getAtomicNumber() {
        return atomicNumber;
    }

    public void setAtomicNumber(int atomicNumber) {
        this.atomicNumber = atomicNumber;
    }

    public double getAtomicWeight() {
        return atomicWeight;
    }

    public void setAtomicWeight(double atomicWeight) {
        this.atomicWeight = atomicWeight;
    }
    
    
    
}
