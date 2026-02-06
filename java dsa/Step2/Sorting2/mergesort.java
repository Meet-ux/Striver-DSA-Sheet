import java.util.ArrayList;

public class mergesort {

    // Function to merge two sorted subarrays of arr[]
    // First subarray = arr[low..mid]
    // Second subarray = arr[mid+1..high]
    static void merge(int[] arr, int low , int mid , int high){

        // Temporary list to store merged elements in sorted order
        ArrayList<Integer> temp = new ArrayList<>();

        int left = low;      // Starting index of left subarray
        int right = mid + 1; // Starting index of right subarray

        // Merge elements in sorted order from both subarrays
        while(left <= mid && right <= high) {
            if(arr[left] <= arr[right]){
                temp.add(arr[left]); // Add smaller element from left subarray
                left++;
            }
            else{
                temp.add(arr[right]); // Add smaller element from right subarray
                right++;
            }
        }

        // Add remaining elements from left subarray (if any)
        while(left <= mid) {
           temp.add(arr[left]);
           left++;
        }

        // Add remaining elements from right subarray (if any)
        while(right <= high) {
           temp.add(arr[right]);
           right++;
        }

        // Copy the merged elements back into original array
        for(int i = low; i <= high ; i++){
            arr[i] = temp.get(i - low); // temp index starts from 0
        }
    }

    // Recursive merge sort function
    // Sorts the array arr[low..high]
    static void mergeSort(int[] arr, int low , int high){

        if(low >= high) return; // Base case: 1 element is already sorted

        int mid = (low + high) / 2; // Find the middle index

        mergeSort(arr, low, mid);      // Sort first half
        mergeSort(arr, mid + 1, high); // Sort second half
        merge(arr, low, mid, high);    // Merge the two sorted halves
    }

    public static void main(String[] args) {

        int[] arr = new int[]{23, 45, 1, 12, 7, 3}; // Sample array to sort
        int low = 0;                 // Starting index
        int high = arr.length - 1;   // Ending index

        mergeSort(arr, low, high);   // Call merge sort

        // Print the sorted array
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
