/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author acale
 */

import java.util.ArrayList;

public class Stack {
    
    private ArrayList<String> listOfStrings;
    
    public Stack() {
        this.listOfStrings = new ArrayList<>();
    }
    
    public boolean isEmpty() {
        return listOfStrings.isEmpty();
    }

    public void add(String value) {
        this.listOfStrings.add(0, value);
    }

    public ArrayList<String> values() {
        return this.listOfStrings;
    }
    
    public String take() {
        String stringToRemove = this.listOfStrings.get(0);
        this.listOfStrings.remove(stringToRemove);
        
        return stringToRemove;
    }
    
}
