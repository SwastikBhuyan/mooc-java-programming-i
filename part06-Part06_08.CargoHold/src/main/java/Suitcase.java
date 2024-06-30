
import java.util.ArrayList;

public class Suitcase {
    
    private int maxWeight;
    private ArrayList<Item> items;
    
    public Suitcase(int maxWeight) {
        this.maxWeight = maxWeight;
        this.items = new ArrayList<>();
    }
    
    public void addItem(Item item) {
        if (this.getMaxWeight() >= (this.totalWeight() + item.getWeight())) {
            this.items.add(item);
        }
    }
    
    public int getMaxWeight() {
        return this.maxWeight;
    }
    
    public ArrayList<Item> getItems() {
        return this.items;
    }
    
    public int totalWeight() {
        int totalWeight = 0;
        for (Item item : items) {
            totalWeight += item.getWeight();
        }
        return totalWeight;
    }
    
    public String toString() {
        
        if (this.items.isEmpty()) {
            return "no items (0 kg)";
        }
        
        if (this.items.size() == 1) {
            return (this.getItems().size() + " item (" + this.totalWeight() + " kg)");
        }
        
        return (this.getItems().size() + " items (" + this.totalWeight() + " kg)");
    }
    
    public void printItems() {
        for (Item item : items) {
            System.out.println(item.getName() + " (" + item.getWeight() + " kg)");
        }
    }
    
    public Item heaviestItem() {
        if (this.items.isEmpty()) return null;
        Item heaviestItem = this.items.get(0);
        for (Item item : items) {
            if (item.getWeight() > heaviestItem.getWeight()) {
                heaviestItem = item;
            }
        }
        return heaviestItem;
    }
}
