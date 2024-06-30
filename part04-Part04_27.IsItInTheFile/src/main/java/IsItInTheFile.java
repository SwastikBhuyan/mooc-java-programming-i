
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class IsItInTheFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file:");
        String file = scanner.nextLine();
        
        ArrayList<String> fileContents = new ArrayList<>();

        try (Scanner input = new Scanner(Paths.get(file))) {

            while (input.hasNextLine()) {
                
                String contents = input.nextLine();

                fileContents.add(contents);
            }
            
        } catch (Exception e) {
            System.out.println("Reading the file " + file + " failed.");
        }

        System.out.println("Search for:");
        String searchedFor = scanner.nextLine();

        if (fileContents.contains(searchedFor)) {
            System.out.println("Found!");
        } else {
            System.out.println("Not found.");
        }
    }
}
