public class revArr{
    public static void reverse(int i , int r , int arr[]){
        if(i>=r){
            return;
        }
        int temp = arr[i];
        arr[i] = arr[r];
        arr[r] = temp;
        i = i + 1 ;
        r = r - 1 ;
    }
    public static void main(String args[]){
        // int[] arr = new int[5];
        int[] arr = new int[] {1,2,3,4,5};
        
        System.out.println("The array before reverse");
        for(int e : arr){
            System.out.print(e+" ");
        }
        int init = arr[0];
        int last = arr.length-1;
        reverse(init , last , arr);
        System.out.println();
        System.out.println("The array after reverse");
        for(int e : arr){
            System.out.print(e+" ");
        }
    }
}