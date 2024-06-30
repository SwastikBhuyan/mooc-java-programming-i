
import java.util.Scanner;

public class TextUI {

    private Scanner scanner;
    private SimpleDictionary dictionary;

    public TextUI(Scanner scanner, SimpleDictionary dictionary) {
        this.scanner = scanner;
        this.dictionary = dictionary;
    }

    public void start() {
        while (true) {
            System.out.print("Command: ");
            String command = this.scanner.nextLine();
            if (command.equals("end")) {
                System.out.println("Bye Bye!");
                break;
            }
            
            else if (command.equals("add")) {
                this.add();
            }
            
            else if (command.equals("search")) {
                this.search();
            }
            
            else {
                System.out.println("Unknown Command");
            }
        }

    }
    
    public void add() {
        System.out.print("Word: ");
        String word = this.scanner.nextLine();
        System.out.print("Translation: ");
        String translation = this.scanner.nextLine();
        
        this.dictionary.add(word, translation);
        
    }
    
    public void search() {
        System.out.print("To be translated: ");
        String word = this.scanner.nextLine();
        String translatedWord = this.dictionary.translate(word);
        
        if (translatedWord == null) {
            translatedWord = ("Word " + word + " was not found");
        }
        System.out.println("Translation: " + translatedWord);
    }
    
    
}
