
import java.util.Scanner;


public class UserInterface {
    
    private Scanner scanner;
    private Container first;
    private Container second;
    
    public UserInterface() {
        this.scanner = new Scanner(System.in);
    }
    
    public void start() {
        
        while (true) {
            System.out.println("First: " + first.getVolume() + "/100");
            System.out.println("Second: " + second.getVolume() + "/100");
            String input = scanner.nextLine();
            
            if (input.equals("quit")) {
                break;
            }
            
            processInput(input);
        }
    }
    
    public void processInput(String input) {
        
        String[] parts = input.split(" ");
        String command = parts[0];
        int amount = Integer.valueOf(parts[1]);
        
        processCommand(command, amount);
    }
    
    public void processCommand(String command, int amount) {
        
        if (command.equals("add")) {
            addAmount(amount);
        }
        
        if (command.equals("move")) {
            moveAmount(amount);
        }
        
        if (command.equals("remove")) {
            removeAmount(amount);
        }
    }
    
    public void addAmount(int amount) {
        
            first.add(amount);
    }
    
    public void moveAmount(int amount) {
        
            first.move(amount, second);
    }
    
    public void removeAmount(int amount) {
    
            second.remove(amount);
    }
}
