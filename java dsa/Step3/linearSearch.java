

public class linearSearch {
    public static void linSearch(int[] nums , int value){
        int checks = 0;
        for(int i = 0;i<nums.length;i++){
            checks++;
            if(nums[i]==value){
                System.out.println("Value found at index "+i);
                System.out.println("Checks done in total is-"+checks);
                return;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {12,3,3,5,6};
        linSearch(arr, 5);
    }
}
