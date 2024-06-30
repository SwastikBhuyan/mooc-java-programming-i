import java.nio.file.Paths;
import java.util.Scanner;

public class UserInterface {
    
    private Scanner scanner;
    private RecipeBook recipeBook;
    
    public UserInterface() {
        this.scanner = new Scanner(System.in);
        this.recipeBook = new RecipeBook();
    }
    
    public void start() {
        System.out.print("File to read: ");
        String fileName = scanner.nextLine();
        readFile(fileName);
        recipeBook.filterRecipeList();
        
        System.out.println("");
        System.out.println("Commands:");
        System.out.println("list - lists the recipes");
        System.out.println("stop - stops the program");
        System.out.println("find name - searches recipes by name");
        System.out.println("find cooking time - searches recipes by cooking time");
        System.out.println("find ingredient - searches recipes by ingredient");
        System.out.println("");
        
        while (true) {
            System.out.print("Enter command: ");
            String command = scanner.nextLine();
            
            if (command.equals("stop")) {
                break;
            }
            
            processCommand(command);
        }
    }
    
    public void readFile(String fileName) {
        try (Scanner scan = new Scanner(Paths.get(fileName))) {
            while (scan.hasNextLine()) {
                String row = scan.nextLine();
                recipeBook.add(row);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    
    public void processCommand(String command) {
        if (command.equals("list")) {
            System.out.println(recipeBook.list());
        } else if (command.equals("find name")) {
            System.out.print("Searched word: ");
            String name = scanner.nextLine();
            System.out.println(recipeBook.find(name));
        } else if (command.equals("find cooking time")) {
            System.out.print("Max cooking time: ");
            int timeLimit = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character after the integer
            System.out.println(recipeBook.find(timeLimit));
        } else if (command.equals("find ingredient")) {
            System.out.print("Ingredient: ");
            String ingredient = scanner.nextLine();
            System.out.println(recipeBook.findByIngredient(ingredient));
        }
    }
}
