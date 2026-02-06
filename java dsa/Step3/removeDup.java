import java.util.LinkedHashSet;

public class removeDup {

    // Brute force method to remove duplicates using LinkedHashSet
    static int bruteForce(int arr[]) {
        // LinkedHashSet preserves insertion order and automatically removes duplicates
        LinkedHashSet<Integer> set = new LinkedHashSet<>();

        // Add all elements from array to the set (duplicates automatically removed)
        for(int i = 0; i < arr.length; i++){
            set.add(arr[i]);
        }

        // Copy unique elements back to the array
        int i = 0;
        for(int e : set){
            arr[i] = e; // overwrite arr with unique elements
            i++;
        }

        int k = set.size(); // number of unique elements
        return k;
    }

    // Optimal method to remove duplicates from a sorted array
    static int optimal(int arr[]){
        int i = 0; // index for last unique element

        // Traverse array starting from the second element
        for(int j = 1; j < arr.length; j++){
            // If current element is different from last unique element
            if(arr[j] != arr[i]){
                i++;        // move the unique index
                arr[i] = arr[j]; // place the new unique element at next position
            }
        }

        return i + 1; // return count of unique elements
    }

    public static void main(String[] args) {
        // Array with duplicate elements
        int[] arr1 = new int[]{2, 4, 4, 6, 6, 10, 66, 96};
        System.out.println(bruteForce(arr1)); // prints number of unique elements using brute force

        // Another array for optimal method (ensure it's sorted)
        int[] arr2 = new int[]{2, 4, 4, 6, 6, 10, 66, 96};
        System.out.println(optimal(arr2)); // prints number of unique elements using optimal approach
    }
}
