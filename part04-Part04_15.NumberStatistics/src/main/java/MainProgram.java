
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter numbers:");
        Statistics statistics1 = new Statistics();
        Statistics statistics2 = new Statistics();
        Statistics statistics3 = new Statistics();

        while (true) {
            int num = scanner.nextInt();
            if (num == -1) {
                break;
            }
            statistics1.addNumber(num);
            if (num % 2 == 0) {
                statistics2.addNumber(num);
            } else {
                statistics3.addNumber(num);
            }
        }

        System.out.println("Sum: " + statistics1.sum());
        System.out.println("Sum of even numbers: " + statistics2.sum());
        System.out.println("Sum of odd numbers: " + statistics3.sum());
    }
}
