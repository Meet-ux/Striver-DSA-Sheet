//Hashing the integer and finding their frequency using the HashMap.

import java.util.HashMap;
import java.util.Scanner;

public class intHashMap {
        static void intHashing(){
            //Declarations and Inputs
            Scanner sc = new Scanner(System.in);
            HashMap <Integer , Integer> hm = new HashMap<>();

            int[] arr = new int[10];
            System.out.println("Enter the integer upto 10 numbers");
            for(int i = 0 ; i<arr.length;i++){
                int element = sc.nextInt();
                arr[i] = element;
            }

            //Precomputing the array into HashMap
            for (int i : arr) {
                hm.put(i,hm.getOrDefault(i, 0)+1);
            }
            System.out.println(hm.entrySet());
sc.close();
            
        }
    public static void main(String[] args) {
        intHashing();
    }
}
