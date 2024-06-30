
public class Container {
    
    private int volume;
    
    public Container() {
        this.volume = 0;
    }
    
    public void add(int amount) {
        
        this.volume += amount;
        
        if (this.volume > 100 ) {
            this.volume = 100;
        }
    }
    
    public void remove(int amount) {
        
        this.volume -= amount;
        
        if (this.volume < 0) {
            this.volume = 0;
        }
    }
    
    public void move(int amount, Container container) {
        remove(amount);
        container.add(amount);
    }
    
    public void remove(int amount, Container container) {
        
        container.remove(amount);
    }
    
    public int getVolume() {
        return this.volume;
    }
    
}
