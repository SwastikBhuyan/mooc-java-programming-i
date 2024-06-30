
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();

        System.out.print("File? ");
        String file = scanner.nextLine();
        
        try (Scanner scan = new Scanner(Paths.get(file))) {
            while (scan.hasNextLine()) {
                list.add(scan.nextLine());
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        System.out.print("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.print("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());
        int count = 0;
        
        for (String num : list ) {
            if (Integer.valueOf(num) >= lowerBound && Integer.valueOf(num) <= upperBound) {
                count += 1;
            }
        }
        System.out.println("Numbers: " + count);
    }

}
