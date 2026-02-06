import java.util.Arrays;

public class FindMissing {
     public static int missingNumber(int[] nums) {
        int n = nums.length;
        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;

        for (int x : nums) actualSum += x;

        return expectedSum - actualSum;
    }
    public static void main(String[] args) {
        int[] arr  = {0,1,5,3,4,9,8,7,6};
        // System.out.println(missingElement(arr));;
        System.out.println(missingNumber(arr));
    }
}
