import java.util.Arrays;

public class slargest {
    static void bruteForce(int arr[]) {
        Arrays.sort(arr); // Sort the array in ascending order
        int n = arr.length; // Get the size of the array
        System.out.println(arr[n - 1]); // Return the second last element (largest after sorting)
        System.out.println(arr[1]); // returns second smallest
    }

    static void optimal(int[] arr, int n) {
        if (n == 0 || n == 1) {
            System.out.print(-1);
            System.out.print(" ");
            System.out.print(-1);
            System.out.print("\n");
        }
        int small = Integer.MAX_VALUE;
        int second_small = Integer.MAX_VALUE;
        int large = Integer.MIN_VALUE;
        int second_large = Integer.MIN_VALUE;
        int i;
        for (i = 0; i < n; i++) {
            small = Math.min(small, arr[i]);
            large = Math.max(large, arr[i]);
        }
        for (i = 0; i < n; i++) {
            if (arr[i] < second_small && arr[i] != small) {
                second_small = arr[i];
            }
            if (arr[i] > second_large && arr[i] != large) {
                second_large = arr[i];
            }
        }

        System.out.println("Second smallest is " + second_small);
        System.out.println("Second largest is " + second_large);
    }

    public static void main(String[] args) {
        // Initialize an array of integers
        int[] arr = new int[] { 2, 4, 67, 67, 34, 16, 6 };

        bruteForce(arr); // Output second largest and second smallest using sorting method
        optimal(arr,arr.length); 
    }
}
