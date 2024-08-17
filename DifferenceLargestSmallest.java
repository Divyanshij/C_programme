//Write a Java program to get the difference between the largest and smallest values in an array of integer
public class DifferenceLargestSmallest{

    public static void main(String[] args) {
        int[] arr = {5, 3, 9, 8, 6};
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int diff;
           
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        diff = max - min;
        System.out.println("largest " + max);
        System.out.println("smallest: " + min);
        System.out.println("Difference: " + diff);
    }
} 