
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;



public class Main {

    public static void main(String[] args) {
        int[] array = {3, 1, 5, 99, 3, 12};
        String[] str = {"g","b","a","c","b","e","d","f"};
        sort(str);
        sort(array);
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(str));
    }
    
    public static void sort(int[] array) {
        Arrays.sort(array);
    }
    
    public static void sort(String[] array) {
        Arrays.sort(array);
    }
    
    public static void sortIntegers(ArrayList<Integer> integers) {
        Collections.sort(integers);
    }
    
    public static void sortStrings(ArrayList<String> strings) {
        Collections.sort(strings);
    }
    

}
