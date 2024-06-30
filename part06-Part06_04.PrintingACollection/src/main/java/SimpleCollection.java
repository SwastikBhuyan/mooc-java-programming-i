
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }
    
    public String getName() {
        return this.name;
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }
    
    public String toString() {
        if (this.elements.isEmpty()) {
            return "The collection " + this.getName() + " is empty.";
        }
        
        else if (this.elements.size() == 1) {
            String str = "";
            
            for (String element : elements) {
                str += element;
            }
            
            return ("The collection " + this.getName() + " has " + this.elements.size() + " element:" + "\n" + str);
        }
        
        else {
            
            String str = "";
            
            for (String element : elements) {
                str += element + "\n";
            }
            
            return "The collection " + this.getName() + " has " + this.elements.size() + " elements:" + "\n" + str;
        }
        
        
    }
    
}



//

//expected:<...s 1 element: element[]> 
//but was:<...s 1 element: element[ ]>



//
