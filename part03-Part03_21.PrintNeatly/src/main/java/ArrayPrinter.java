
public class ArrayPrinter {

    public static void main(String[] args) {
        // You can test your method here
        int[] array = {5, 1, 3, 4, 2};
        printNeatly(array);
    }

    public static void printNeatly(int[] array) {
        // Write some code in here
        String str = "";
        for (int i = 0; i < array.length - 1; i++) {
            str += array[i];
            str += ",";
        }
        str += array[array.length - 1];
        System.out.println(str);
    }
}
