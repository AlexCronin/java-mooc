/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author acale
 */
public class Archive {
    
    private String identifier;
    private String name;
    
    public Archive(String identifier, String name) {
        this.identifier = identifier;
        this.name = name;
    }
    
    public String toString() {
    return this.identifier+ ": " + this.name;
    }
    
            // implement an equals method here for checking the equality of objects
    public boolean equals (Object compared) {
        // if the variables are located in the same position, they are equal
         if (this == compared) {
             return true;
         }
         
        // if the compared object is not of type Person, the objects are not equal
        if (!(compared instanceof Archive)) {
            return false;
        }

        // convert the Object type compared object
        // into a Archive type object called comparedItem
        Archive comparedItem = (Archive) compared;

        // if the values of the object variables are equal, the objects are equal
        if (this.identifier.equals(comparedItem.identifier) &&
            this.name.equals(comparedItem.name)) {
            return true;
        }
        
        // if the just the identifier value of the object variables are equal, the objects are equal
        if (this.identifier.equals(comparedItem.identifier)) {
            return true;
        }

        // otherwise the objects are not equal
        return false;
    }
    
}
