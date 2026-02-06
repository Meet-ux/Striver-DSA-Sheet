// Importing required libraries

import java.util.Arrays;

public class largestArr {

    // Method 1: Brute Force Approach
    // This method sorts the array and returns the last element (which is the largest)
    static int bruteForce(int arr[]) {
        Arrays.sort(arr);  // Sort the array in ascending order
        int n = arr.length;  // Get the size of the array
        return arr[n - 1];   // Return the last element (largest after sorting)
    }

    // Method 2: Iterative Approach (actually not recursive, it’s linear search)
    // This method iterates through the array and finds the largest element manually
    static int RecursiveApproach(int arr[]) {
        int max = arr[0];  // Assume first element as maximum
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {  // If current element is greater than max
                max = arr[i];    // Update max
            }
        }
        return max;  // Return the largest element
    }

    // Main function — entry point of the program
    public static void main(String[] args) {
        // Initialize an array of integers
        int[] arr = new int[]{2, 4, 67, 34, 16, 6};
       
        // Print largest element using both methods
        System.out.println(bruteForce(arr));         // Output using sorting method
        System.out.println(RecursiveApproach(arr));  // Output using linear comparison method
    }
}
