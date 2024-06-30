
import java.util.ArrayList;

public class Room {
    
    private ArrayList<Person> persons;
    public Room() {
        this.persons = new ArrayList<>();
    }
    
    public void add(Person person) {
        this.persons.add(person);
    }
    
    public boolean isEmpty() {
        return this.persons.isEmpty();
    }
    
    public ArrayList<Person> getPersons() {
        return this.persons;
    }
    
    public Person shortest() {
        if (this.persons.isEmpty()) return null;
        Person shortestPerson = this.persons.get(0);
        for (Person per : persons) {
            if (per.getHeight() < shortestPerson.getHeight()) {
                shortestPerson = per;
            }
        }
        return shortestPerson;
    }
    
    public Person take() {
        
        if (this.persons.isEmpty()) return null;
        Person shortestPerson = this.shortest();
        this.persons.remove(shortestPerson);
        
        return shortestPerson;
    }
}
