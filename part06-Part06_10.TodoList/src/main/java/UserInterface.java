import java.util.Scanner;

public class UserInterface {
    
    private TodoList list;
    private Scanner scanner;
    
    public UserInterface(TodoList list, Scanner scanner) {
       this.list = list;
       this.scanner = scanner;
    }
    
    public void start() {
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("stop")) {
                break;
            }
            
            manageCommand(input);
        }
    }
    
    public void manageCommand(String input) {
        
        if (input.equals("add")) {
            add();
        }
        else if (input.equals("list")) {
            list();
        }
        else if (input.equals("remove")) {
            remove();
        }
    }
    
    public void add() {
        System.out.print("To add: ");
        String input = scanner.nextLine();
        this.list.add(input);
    }
    
    public void list() {
        this.list.print();
    }
    
    public void remove() {
        System.out.print("Which one is removed? ");
        int input = scanner.nextInt();
        this.list.remove(input);
    }
}
