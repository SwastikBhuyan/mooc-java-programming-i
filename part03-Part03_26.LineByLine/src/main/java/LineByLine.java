
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String str = scanner.nextLine();

            if (str.equals("")) {
                break;
            }

            String[] pieces = str.split(" ");
            for (String piece : pieces) {
                System.out.println(piece);
            }
        }

    }
}
