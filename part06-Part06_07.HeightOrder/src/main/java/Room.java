
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author acale
 */
public class Room {
    
    private ArrayList<Person> persons;
 
    public Room() {
        this.persons = new ArrayList<>();
    }
    
    public void add(Person person) {
        this.persons.add(person);
    }
    
    public boolean isEmpty() {
        if(persons.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }
    
    public ArrayList<Person> getPersons() {
        return this.persons;
    }
    
    public Person shortest() {
        
        // return a null reference if there's no one in the room
        if (this.persons.isEmpty()) {
            return null;
        }

        // create an object reference for the object to be returned
        // its first value is the first object on the list
        Person returnObject = this.persons.get(0);
        
        for(Person p : persons) {
            // compare each object on the list
            // to the returnObject -- we compare heights
            // since we're searching for the shortest,

            if (p.getHeight() < returnObject.getHeight()) {
                // if we find a shorter person in the comparison,
                // we assign it as the value of the returnObject
                returnObject = p;
            }
        }
        
        return returnObject;
    }
    
    public Person take() {
        
        // return a null reference if there's no one in the room
        if (this.persons.isEmpty()) {
            return null;
        }
        
        Person returnObject = this.shortest();
        persons.remove(this.shortest());

        return returnObject;
    }
    
}
