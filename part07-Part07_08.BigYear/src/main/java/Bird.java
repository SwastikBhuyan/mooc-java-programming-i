
public class Bird {
    
    private String name;
    private String latinName;
    private int observationCount;
    
    public Bird(String name, String latinName, int observationCount) {
        this.name = name;
        this.latinName = latinName;
        this.observationCount = observationCount;
    }
    
    public void addObservation () {
        this.observationCount += 1;
    }
    
    public String getName() {
        return this.name;
    }
    
    public String getLatinName() {
        return this.latinName;
    }
    
    public int getObservationCount() {
        return this.observationCount;
    }
    
    public String toString() {
        return (getName() + " (" + getLatinName() + "): " + getObservationCount() + " observations");
    }
}
