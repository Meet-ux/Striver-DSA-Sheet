public class SingleNumber {
    public static int singleNumber(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int repeated = nums[i];
            for (int j = 0; j < nums.length; j++) {
                if (repeated==nums[j]) {
                    continue;
                }
            }
            return i;
        }
        return 1;
    }
    public static void main(String[] args) {
        int[] arr = {1,1,2,2,4,5,5}; 
        System.out.println(singleNumber(arr));;
    }
}
