
public class AdvancedAstrology {

    public static void printStars(int number) {
        // part 1 of the exercise
        for (int i = 0; i < number; i++) {
            System.out.print("*");
        }
        System.out.println("");
    }

    public static void printSpaces(int number) {
        // part 1 of the exercise
        for (int i = 0; i < number; i++) {
            System.out.print(" ");
        }

    }

    public static void printTriangle(int size) {
        // part 2 of the exercise
        for (int i = 1; i <= size; i++) {
            printSpaces(size - i);
            printStars(i);
        }

    }

    public static void christmasTree(int height) {
        // part 3 of the exercise
        for (int i = 1; i <= height; i++) {
            printSpaces(height - i);
            printStars(2 * i - 1);
        }

        for (int i = 0; i < 2; i++) { // Adjust this for the trunk height
            printSpaces(height - 2);
            printStars(3);
        }

    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.

//        printSpaces(3);
//        printStars(1);
//        printSpaces(3);
//        System.out.println("");
//        printSpaces(2);
//        printStars(3);
//        printSpaces(2);
//        System.out.println("");
//        printSpaces(1);
//        printStars(5);
//        printSpaces(1);
//        System.out.println("");
//        printSpaces(0);
//        printStars(7);
//        printSpaces(0);
//        System.out.println("");
//        printSpaces(2);
//        printStars(3);
//        printSpaces(2);
//        System.out.println("");
//        printSpaces(2);
//        printStars(3);
//        printSpaces(2);
//        System.out.println("");
        printTriangle(5);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
    }
}
