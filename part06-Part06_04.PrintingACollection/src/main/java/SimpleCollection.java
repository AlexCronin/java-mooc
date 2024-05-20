
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }
    
    public String toString() {
        
        if (elements.isEmpty()) {
            return "The collection " + this.name + " is empty.";
        }
        
        // we form a string from the elements on the list
        String myList = "";

        for (String e: elements) {
            myList = myList + e + "\n";
        }
        
        if(elements.size()==1) {
            return "The collection " + this.name + " has " + elements.size() + " element:\n" + elements.get(0);
        }
        
        return "The collection " + this.name + " has " + elements.size() + " elements:\n" + myList;
    }
}
