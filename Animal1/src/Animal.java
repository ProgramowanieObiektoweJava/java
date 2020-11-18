/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Focus time
 */
public abstract class Animal {
    private final String name;

    public Animal(String name) {
        this.name = name;
    }
    
    protected String path() {
        return "";
    }

    @Override
    public String toString() {
        return path() + ": " + name;
    }
    
    
}
