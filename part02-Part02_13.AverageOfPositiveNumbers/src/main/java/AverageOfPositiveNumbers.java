
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        while (true) {
            System.out.println("Give a number:");
            int num = scanner.nextInt();
            if (num == 0) {
                break;
            } else if (num > 0) {
                sum += num;
                count += 1;
            }
        }
        if (count == 0) {
            System.out.println("Cannot calculate the average");
        }
        double avg = 1.0 * sum / count;
        System.out.println("Average of the numbers: " + avg);
    }
}
