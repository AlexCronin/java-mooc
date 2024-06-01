
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
public class Hold {
    
    private int maxWeight;
    private int weight = 0;
    
    private ArrayList<Suitcase> suitcases = new ArrayList<>();
    
    public Hold(int maxWeight) {
        this.maxWeight = maxWeight;
    }
    
    public void addSuitcase(Suitcase suitcase) {
        
        if(suitcase.totalWeight() + weight <= maxWeight){
            suitcases.add(suitcase);
            weight = weight + suitcase.totalWeight();
        }
        
    }
    
    public void printItems() {
        for(Suitcase suitcase : suitcases) {
            suitcase.printItems();
        }
    }
    
    public String toString() {
        return suitcases.size() + " suitcases (" + weight + " kg)";
    }
    
}
