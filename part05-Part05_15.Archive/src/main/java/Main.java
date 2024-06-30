
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Item> items = new ArrayList<>();
        
        
        while (true) {
            System.out.println("Identifier? (empty will stop)");
            String identifier = scanner.nextLine();
            if (identifier.equals("")) {
                break;
            }
            
            System.out.println("Name? (empty will stop)");
            String name = scanner.nextLine();
            if (name.equals("")) {
                break;
            }
            
            Item newItem = new Item(identifier, name);
            boolean alreadyPresent = false;
            
            for (Item item : items) {
                if (item.getIdentifier().equals(identifier)) {
                    alreadyPresent = true;
                    break;
                }
            }
            
            if (!alreadyPresent) {
                items.add(newItem);
            }
            
        }
        
        System.out.println("==Items==");
        for (Item item : items) {
            System.out.println(item.getIdentifier() + ": " + item.getName());
        }
    }
}
