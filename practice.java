class practice {
    public static void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n; // Reduce k

        reverse(nums, 0, n - 1);     // Step 1
        reverse(nums, 0, k - 1);     // Step 2
        reverse(nums, k, n - 1);     // Step 3
    }

    private static void reverse(int[] nums, int left, int right) {
        while (left < right) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
    }
    public static void main(String[] args) {
        int[] arr = {13,4,5,4,6,7};
        rotate(arr,3);
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
}
