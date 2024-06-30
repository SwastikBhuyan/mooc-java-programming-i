
public class HealthStation {
    
    private int weighingCount;
    
    public HealthStation() {
        this.weighingCount = 0;
    }

    public int weigh(Person person) {
        this.weighingCount ++;
        return person.getWeight();
    }
    
    public void feed(Person person) {
        person.setWeight(person.getWeight() + 1);
    }
    
    public int weighings() {
        return this.weighingCount;
    }

}
