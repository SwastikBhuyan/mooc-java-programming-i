import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // implement here your program that uses the TelevisionProgram class

        ArrayList<TelevisionProgram> programs = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Name: ");
            String showName = scanner.nextLine();
            if (showName.isEmpty()) {
                break;
            }
            System.out.print("Duration: ");
            int duration = Integer.valueOf(scanner.nextLine());
            
            programs.add(new TelevisionProgram(showName, duration));
        }
        System.out.println("");
        System.out.print("Program's maximum duration? ");
        int maxDuration = scanner.nextInt();
        for (TelevisionProgram program : programs) {
            if (program.getDuration() <= maxDuration) {
                System.out.println(program.getName() + ", " + program.getDuration() + " minutes");
            }
        }
    }
}
