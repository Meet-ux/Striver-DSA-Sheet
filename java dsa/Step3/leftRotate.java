//Left Rotating till the K times 

public class leftRotate {
    public static void rotateleft(int[] nums, int k) {
        // 5 stored
        // 1,2,3,4,5
        // 1,2,3,4,4
        // 1,2,3,3,4
        // 1,2,2,3,4
        // 1,1,2,3,4

        // 1,1,2,3,4

        for (int j = 1; j <= k; j++) {
            int right = nums[nums.length - 1];
            for (int i = nums.length - 1; i > 0; i--) {
                nums[i] = nums[i - 1];
            }
            nums[0] = right;
        }

    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
        rotateleft(arr, 3);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
