
import java.util.ArrayList;

public class Stack {
    private ArrayList<String> list;
    
    public Stack() {
        this.list = new ArrayList<>();
    }
    
    public boolean isEmpty() {
        return this.list.isEmpty();
    }
    
    public void add(String value) {
        this.list.add(value);
    }
    
    public ArrayList<String> values() {
        return this.list;
    }
    
    public String take() {
        String topmost = this.list.get(list.size() - 1);
        this.list.remove(list.size() - 1);
        return topmost;
    }
}
