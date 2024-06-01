
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
public class Suitcase {
    
    private ArrayList<Item> items = new ArrayList<>();
    private int maxWeight;
    private int heaviestItemIndex = 0;
    
    public Suitcase(int maxWeight){
        this.maxWeight = maxWeight;
    }
    
    public void addItem(Item item) {
        if(item.getWeight() + totalWeight() <= maxWeight){
            items.add(item);
        }
        
    }
    
    public void printItems(){   //method, which prints all the items in the suitcase
        for(Item item : items){
            System.out.println(item);
        }
    }
    
    public int totalWeight(){  //method, which returns the total weight of the items
        int totalWeight = 0;
        for(Item item : items){
            totalWeight = totalWeight + item.getWeight();
        }
        return totalWeight;
    }
    
    public Item heaviestItem(){  //method, which returns the largest item based on weight
        int heaviest = 0;
        if (items.isEmpty()) {
            return null;
        }
        for(int i = 0; i< items.size(); i++){
            if(items.get(i).getWeight() > heaviest ){
                heaviest = items.get(i).getWeight();
                heaviestItemIndex = i;
            }
        }
        
        return items.get(heaviestItemIndex);
    }
    
    public String toString(){
        if(items.size() == 0){
            return "no items (" + totalWeight() + " kg)";
        } else if(items.size() == 1) {
            return items.size() + " item (" + totalWeight() + " kg)";
        } else {
            return items.size() + " items (" + totalWeight() + " kg)";
        }
        
    }
}
