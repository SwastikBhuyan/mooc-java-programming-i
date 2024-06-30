
import java.util.ArrayList;


public class BirdManager {
    
    private ArrayList<Bird> birdList;
    
    public BirdManager() {
        this.birdList = new ArrayList<>();
    }
    
    public void add(Bird bird) {
        birdList.add(bird);
    }
    
    public Bird search(String name) {
        
        Bird searchedBird = new Bird("","",0);
        
        for (Bird bird : birdList) {
            if (bird.getName().equals(name)) {
                searchedBird = bird;
            }
        }
        return searchedBird;
    }

    public String toString() {
        String stringBuilder = "";
        
        for (int i = 0; i < birdList.size(); i++) {
            if (i != birdList.size() - 1) {
                stringBuilder += birdList.get(i) + "\n";
            } else {
                stringBuilder += birdList.get(i);
            }
        }
        
        return stringBuilder; 
    }
    
}
