import java.util.HashMap;
import java.util.Scanner;

public class charHashMap {
    static void charHashing() {
        // Create Scanner object to take input from user
        Scanner sc = new Scanner(System.in);

        // Create a HashMap to store each character and its frequency
        HashMap<String, Integer> hm = new HashMap<>();

        // Take input string from the user
        System.out.println("Enter the String");
        String element = sc.next();

        // Loop through each character of the string
        for (int j = 0; j < element.length(); j++) {

            // Extract one character at a time as a substring (from j to j+1)
            String key = element.substring(j, j + 1);

            // Update frequency of the character in HashMap
            // If character already exists → increase count by 1
            // If not → put it with count 1 (using getOrDefault)
            hm.put(key, hm.getOrDefault(key, 0) + 1);
        }

        // Print all key-value pairs (character and its frequency)
        System.out.println(hm.entrySet());
        sc.close();
    }

    public static void main(String[] args) {
        // Call the function
        charHashing();
    }
}
