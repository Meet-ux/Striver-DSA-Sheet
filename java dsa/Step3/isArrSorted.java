public class isArrSorted {
    static boolean bruteForce(int arr[]){
        for(int i = 0; i<arr.length;i++){
            for(int j = i+1 ; j< arr.length ; j++){
                if (arr[j]<arr[i]) {
                    return false;
                }
            }
        } 
        return true;
    }
    static boolean Optimal(int arr[]){
        for(int i = 0; i<arr.length-1;i++){
            
                if (arr[i+1]<arr[i]) {
                    return false;
                }
        } 
        return true;
    }


    public static void main(String[] args) {
    int[] arr1 = new int[]{2, 4, 6, 10, 66, 96};
      System.out.println(bruteForce(arr1));
      System.out.println(Optimal(arr1));

      
    }
}
