// Counting Array Elements frequency using Number Array Hashing

import java.util.Scanner;

public class intArrayHashing {

    static void count(int a[]) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Create a Hash array to store frequencies
        int[] Hash = new int[15];  // size 15 means it can handle numbers 0–14

        // Step 2: Precompute frequency of each number in array 'a'
        for (int i = 0; i < a.length; i++) {
            // Example: if a[i] = 5, then Hash[5] will be increased by 1
            // It counts how many times each number appears
            Hash[a[i]] += 1;
        }

        // Step 3: Take user input to check frequency of any number
        System.out.println("Enter the number you want to check its frequency:");
        int input = sc.nextInt();

        // Step 4: Print frequency of that number
        for (int i = 0; i < Hash.length; i++) {
            // When the input number matches the index in Hash array
            if (Hash[input] == Hash[i]) {
                System.out.println("This is the frequency of " + input + " in the array:");
                System.out.println(Hash[i]);
                sc.close();
                return; // exit after printing
            }
        }

        sc.close();
    }

    public static void main(String[] args) {
        // Step 5: Initialize an integer array
        int[] arr = new int[]{1, 2, 4, 5, 6, 7, 5, 7, 2, 3, 1, 5};

        // Step 6: Call count() function
        count(arr);
    }
}
