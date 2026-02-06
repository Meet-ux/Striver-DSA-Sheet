public class quicksort {

    // Partition function for QuickSort
    static int partition(int[] arr, int low, int high) {
        int pivot = arr[low]; // pivot value (first element)
        int i = low+1;      // start from element next to pivot
        int j = high;

        while (i <= j) {
            // Move i right while elements <= pivot
            while (i <= high-1 && arr[i] <= pivot) {
                i++;
            }
            // Move j left while elements > pivot
            while (arr[j] > pivot && j >=low+1) {
                j--;
            }
            // Swap elements if i < j
            if (i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Place pivot in correct position
        int temp = arr[low];
        arr[low] = arr[j];
        arr[j] = temp;

        return j; // Return pivot index
    }

    // QuickSort function
    static void qs(int[] arr, int low, int high) {
        if (low < high) {
            int partitionIndex = partition(arr, low, high); // partition the array
            qs(arr, low, partitionIndex - 1);  // sort left subarray
            qs(arr, partitionIndex + 1, high); // sort right subarray
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{23, 45, 1, 12, 7, 3}; // Sample array to sort
        int low = 0;                 // Starting index
        int high = arr.length - 1;   // Ending index

        qs(arr, low, high); // Call QuickSort

        // Print the sorted array
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
