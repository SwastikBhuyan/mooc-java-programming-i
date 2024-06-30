
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        UserInterface UI = new UserInterface();
        UI.start();
    }
    
    public static class UserInterface {
    
    private Scanner scanner;
    private Container first;
    private Container second;
    
    public UserInterface() {
        this.scanner = new Scanner(System.in);
        this.first = new Container();
        this.second = new Container();
    }
    
    public void start() {
        
        while (true) {
            System.out.println("First: " + this.first);
            System.out.println("Second: " + this.second);
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
        
            this.first.add(amount);
    }
    
    public void moveAmount(int amount) {
        
            this.first.move(amount, this.second);
    }
    
    public void removeAmount(int amount) {
    
            this.second.remove(amount);
    }
}

}
