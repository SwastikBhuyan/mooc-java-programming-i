
import java.util.ArrayList;
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> ages = new ArrayList<>();
        int oldest = 0;
        while (true) {
            String str = scanner.nextLine();
            if (str.equals("")) {
                break;
            }
            String[] nameage = str.split(",");
            for (int i = 0; i < nameage.length; i++) {
                if (i % 2 != 0) {
                    ages.add(Integer.valueOf(nameage[i]));
                }
            }

            for (int age : ages) {
                if (age > oldest) {
                    oldest = age;
                }
            }

        }
        System.out.println("Age of the oldest: " + oldest);
    }
}
