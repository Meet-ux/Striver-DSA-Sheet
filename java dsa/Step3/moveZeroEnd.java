public class moveZeroEnd {
    public static void moveZeroes(int[] nums) {

        for (int j = 0; j < nums.length-1; j++) {
            for (int i = 0; i < nums.length - 1; i++) {
                if (nums[i] == 0) {
                    int temp = nums[i];
                    nums[i] = nums[i + 1];
                    nums[i + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 0, 0, 3, 0, 0 };
        moveZeroes(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
