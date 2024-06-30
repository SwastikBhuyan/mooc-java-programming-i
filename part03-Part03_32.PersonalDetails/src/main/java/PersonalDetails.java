
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> years = new ArrayList<>();
        ArrayList<String> names = new ArrayList<>();
        String longestName = "";
        int sumYears = 0;
        while (true) {
            String str = scanner.nextLine();
            if (str.equals("")) {
                break;
            }
            String[] nameage = str.split(",");
            names.add(nameage[0]);
            years.add(Integer.valueOf(nameage[1]));

        }

        int longestNamelength = 0;

        for (String name : names) {
            if (name.length() > longestNamelength) {
                longestNamelength = name.length();
                longestName = name;
            }
        }

        for (int year : years) {
            sumYears += year;
        }

        System.out.println("Longest Name: " + longestName);
        System.out.println("Average of the birth years: " + (1.0 * sumYears) / years.size());

    }
}
