
import java.util.ArrayList;
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> ages = new ArrayList<>();
        ArrayList<String> names = new ArrayList<>();
        String oldestName = "";
        while (true) {
            String str = scanner.nextLine();
            if (str.equals("")) {
                break;
            }
            String[] nameage = str.split(",");
            for (int i = 0; i < nameage.length; i++) {
                if (i % 2 != 0) {
                    ages.add(Integer.valueOf(nameage[i]));
                } else {
                    names.add(nameage[i]);
                }
            }
            int oldestAge = 0;
            for (int age : ages) {
                if (age > oldestAge) {
                    oldestAge = age;
                }
            }

            for (int i = 0; i < ages.size(); i++) {
                if (ages.get(i) == oldestAge) {
                    oldestName += names.get(i);
                }
            }

        }
        System.out.println("Name of the oldest: " + oldestName);

    }
}
