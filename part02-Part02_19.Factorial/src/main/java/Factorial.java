
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Give a number: ");
        int n = scanner.nextInt();
        int product = 1;
        for (int i = 1; i <= n; i++) {
            product *= i;
        }
        System.out.println("The sum is " + product);
    }
}
