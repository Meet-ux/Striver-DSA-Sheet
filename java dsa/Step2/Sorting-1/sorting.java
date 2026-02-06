// Selection Sort Program in Java
public class sorting {

    // Function to perform selection sort on the array
    static void selection_sort(int arr[], int n) {

        // Outer loop for each position in the array
        for (int i = 0; i <= n - 2; i++) {

            int min = i; // Assume the current index is the minimum

            // Inner loop to find the index of the minimum element
            for (int j = i; j <= n - 1; j++) {

                // If a smaller element is found, update min
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }

            // Swap the found minimum element with the first unsorted element
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
    }

    // Function to perform Bubble Sort on an array
    static void bubble_sort(int arr[], int n) {

        // Outer loop: runs from end towards the beginning
        // Each pass places the largest element at the end
        for (int i = n - 1; i >= 1; i--) {

            // Inner loop: compares adjacent elements up to index i-1
            for (int j = 0; j <= i - 1; j++) {

                // If the current element is greater than the next one
                // swap them to move the larger element towards the end
                if (arr[j] > arr[j + 1]) {

                    // Swap elements
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
                System.out.println();
                for (int e : arr) {
                    System.out.print(e+" ");
                }
            }
        }
    }

    static void insertion_sort(int arr[], int n) {
        // Outer loop runs from first element to last
        for (int i = 0; i <= n - 1; i++) {
            int j = i;

            // Inner loop moves the element left until it's in the correct position
            while (j > 0 && arr[j - 1] > arr[j]) {
                // Swap if the previous element is greater than the current
                int temp = arr[j - 1];
                arr[j - 1] = arr[j];
                arr[j] = temp;
                j--; // Move one step left
            }
        }
    }

    public static void main(String[] args) {

        // Initialize the array
        int[] arr = new int[] { 23, 45, 12, 4, 65 };

        int n = arr.length; // Store array length

        // Call the selection sort function
        bubble_sort(arr, n);

        // Print the sorted array
        System.out.println();
        System.out.println("Final Array");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
