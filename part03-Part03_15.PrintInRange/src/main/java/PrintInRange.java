
import java.util.ArrayList;

public class PrintInRange {

    public static void main(String[] args) {
        // Try your method here
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(2);
        numbers.add(6);
        numbers.add(-1);
        numbers.add(5);
        numbers.add(1);
        
        printNumbersInRange(numbers,0,5);
        printNumbersInRange(numbers,3,10);
    }

    public static void printNumbersInRange(ArrayList<Integer> numbers, int lowerLimit, int upperLimit) {
                ArrayList<Integer> list = new ArrayList<>();

        for (int number : numbers) {
            if (number >= lowerLimit && number <= upperLimit) {
                list.add(number);
            }
        }
        System.out.println("The numbers in the range " + "[" + lowerLimit + "," + upperLimit + "]");
        System.out.println(list);
    }
}
