
import java.util.Scanner;


public class UserInterface {
    
    private Scanner scanner;
    private BirdManager birds;
    
    public UserInterface(Scanner scanner, BirdManager birds) {
        this.scanner = scanner;
        this.birds = birds;
    }
    
    public void start() {
        while (true) {
            System.out.print("? ");
            String command = this.scanner.nextLine();

            if (command.equals("Quit")) {
                break;
            }

            processCommand(command);
        }
    }
    
    public void processCommand(String command) {
        
        if (command.equals("Add")) {
            
            System.out.print("Name: ");
            String name = scanner.nextLine();
            
            System.out.print("Name in Latin: ");
            String latinName = scanner.nextLine();
            
            Bird bird = new Bird(name, latinName, 0);
            birds.add(bird);
            
        }
        
        if (command.equals("Observation")) {
        
            System.out.print("Bird? ");
            String name = scanner.nextLine();
            
            Bird searchedBird = birds.search(name);
            
            if (searchedBird.getName().equals("")) {
                System.out.println("Not a bird!");
            }
                
            else searchedBird.addObservation();
            
        }
        
        if (command.equals("All")) {
        
            System.out.println(birds);
        
        }
        
        if (command.equals("One")) {
        
            System.out.print("Bird? ");
            String name = scanner.nextLine();
            
            Bird searchedBird = birds.search(name);
            
            System.out.println(searchedBird);
            
        }
        
    }
}
