import java.util.ArrayList;
import java.util.TreeMap;

public class UnionArray {

    // TreeMap approach (returns sorted unique elements)
    public static ArrayList<Integer> UnArrMap(int[] arr, int[] arr2) {
        TreeMap<Integer, Integer> unArr = new TreeMap<>();
        ArrayList<Integer> arrFinal = new ArrayList<>();

        for (int x : arr) unArr.put(x, unArr.getOrDefault(x, 0) + 1);
        for (int x : arr2) unArr.put(x, unArr.getOrDefault(x, 0) + 1);

        for (int key : unArr.keySet()) arrFinal.add(key);
        return arrFinal;
    }

    // Two-pointer approach for sorted arrays (returns sorted unique union)
    public static ArrayList<Integer> UnionArrTwoP(int[] arr, int[] arr2) {
        ArrayList<Integer> finalArr = new ArrayList<>();
        int n1 = arr.length, n2 = arr2.length;
        int i = 0, j = 0;

        while (i < n1 && j < n2) {
            // skip duplicates inside arr
            if (i > 0 && arr[i] == arr[i - 1]) {
                i++;
                continue;
            }
            // skip duplicates inside arr2
            if (j > 0 && arr2[j] == arr2[j - 1]) {
                j++;
                continue;
            }

            if (arr[i] < arr2[j]) {
                finalArr.add(arr[i]);
                i++;
            } else if (arr[i] > arr2[j]) {
                finalArr.add(arr2[j]);
                j++;
            } else { // equal
                finalArr.add(arr[i]);
                i++;
                j++;
            }
        }

        // leftover elements from arr
        while (i < n1) {
            if (i == 0 || arr[i] != arr[i - 1]) {
                finalArr.add(arr[i]);
            }
            i++; // always increment
        }

        // leftover elements from arr2
        while (j < n2) {
            if (j == 0 || arr2[j] != arr2[j - 1]) {
                finalArr.add(arr2[j]);
            }
            j++; // always increment
        }

        return finalArr;
    }

    public static void main(String[] args) {
        int[] arr  = {3,4,4,4,4,5,7,9,10};
        int[] arr2 = {3,4,4,5,7,7};

        // using two-pointer
        ArrayList<Integer> unionTP = UnionArrTwoP(arr, arr2);
        System.out.println("Two-pointer union: " + unionTP);

        // using TreeMap
        ArrayList<Integer> unionMap = UnArrMap(arr, arr2);
        System.out.println("TreeMap union:     " + unionMap);
    }
}
