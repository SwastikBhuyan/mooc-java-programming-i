
public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] array = {3, 1, 5, 99, 3, 12};
    }
    
    public static int smallest (int[] array) {
        int smallest = array[0];
        
        for (int num : array) {
            if (num < smallest) {
                smallest = num;
            }
        }
        return smallest;
    }
    
    public static int indexOfSmallest(int[] array) {
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == smallest(array)) {
                index = i;
            }
        }
        return index;
    }
    
    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        int ans = 0;
        int smallest = table[startIndex];
        for (int i = startIndex; i < table.length; i++) {
            if (table[i] <= smallest) {
                smallest = table[i];
                ans = i;
            }
        }
        
        return ans;
    }
    
    public static void swap(int[] array, int index1, int index2) {

        int temp = array[index2];
        array[index2] = array[index1];
        array[index1] = temp;
    }
    
    public static void sort(int[] array) {
        
        for (int i = 0; i < array.length - 1; i++) {
            swap(array,i,indexOfSmallestFrom(array,i));
        }
    }

}
