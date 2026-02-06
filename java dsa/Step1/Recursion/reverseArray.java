import java.util.*;

public class reverseArray{
        
    // Recursive function to reverse the array
    static void reverse(int i, int r, int arr[]){
        if(i >= r){
            return; // Base case: stop when start meets or crosses end
        }
        // Swap elements
        int temp = arr[i];
        arr[i]   = arr[r];
        arr[r]   = temp;

        // Recursive call with next indices
        reverse(i + 1, r - 1, arr);
    }

    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int n = sc.nextInt(); 
        int[] array = new int[n]; 

        System.out.println("Enter elements of array for " + n + " times.");
        for(int i = 0; i < n; i++){
            array[i] = sc.nextInt();
        }

        int init = 0;          // Start index
        int r = array.length - 1; // Last index

        reverse(init, r, array);

        System.out.println("Reversed array is : --");
        for(int i = 0; i < n; i++){
            System.out.print(array[i] + " ");
        }
    } 
}
