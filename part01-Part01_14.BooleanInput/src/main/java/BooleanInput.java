
import java.util.Scanner;

public class BooleanInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // write your program here
        System.out.println("Write something:");
        boolean bool = Boolean.valueOf(scanner.nextLine());
        System.out.print("True or false? ");
        System.out.println(bool);
//        boolean bool = true;

    }
}
