
import java.util.ArrayList;

public class Hold {
    
    private int maxWeight;
    private ArrayList<Suitcase> suitcases;
    
    public Hold(int maxWeight) {
        this.maxWeight = maxWeight;
        this.suitcases = new ArrayList<>();
    }
    
    public void addSuitcase(Suitcase suitcase) {
        
        if (this.getMaxWeight() >= (this.totalSuitcasesWeight() + suitcase.totalWeight())) {
            this.suitcases.add(suitcase);
        }
    }
    
    public int getMaxWeight() {
        return this.maxWeight;
    }
    
    public int totalSuitcasesWeight() {
        int totalWeight = 0;
        for (Suitcase suitcase : suitcases) {
            totalWeight += suitcase.totalWeight();
        }
        return totalWeight;
    }
    
    public String toString() {
        return (this.suitcases.size() + " suitcases (" + this.totalSuitcasesWeight() + " kg)");
    }
    
    public void printItems() {
        for (Suitcase suitcase : suitcases) {
            suitcase.printItems();
        }
    }
}
