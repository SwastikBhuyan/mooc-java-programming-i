
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String str = scanner.nextLine();
            if (str.equals("end")) {
                break;
            }
            int num = Integer.valueOf(str);
            int cube = (int) Math.pow(num, 3);
            System.out.println(cube);
        }
    }
}
