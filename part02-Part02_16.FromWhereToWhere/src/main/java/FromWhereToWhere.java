
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.print("Where to?");
        int to = scanner.nextInt();
        System.out.print("Where from?");
        int from = scanner.nextInt();

        if (to > from) {
            for (int i = from; i <= to; i++) {
                System.out.println(i);
            }
        } else if (to == from) {
            System.out.println(to);
        }

    }
}
