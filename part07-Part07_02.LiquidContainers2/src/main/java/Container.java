
public class Container {
    
    private int volume;
    
    public Container() {
        this.volume = 0;
    }
    
    public void add(int amount) {
        
        if (amount > 0) {
            this.volume += amount;
            if (this.volume > 100 ) {
                this.volume = 100;
            }
        }
    }
    
    public void remove(int amount) {
        
        if (amount > 0) {
            this.volume -= amount;
            if (this.volume < 0) {
                this.volume = 0;
            }
        }
    }
    
    public void move(int amount, Container container) {
        
        if (amount > this.volume) {
            amount = this.volume;
        }
        
        remove(amount);
        container.add(amount);
    }
    
    public int contains() {
        return this.volume;
    }
    
    public String toString() {
        return (contains() + "/100");
    }
    
}
