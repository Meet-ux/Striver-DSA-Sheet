public class CountFrequency{
        
        static int count(int number , int a[] ){
            int counter = 0;
            for(int i = 0;i<a.length ; i++){
                if(a[i]==number){//When num matches then counter will be incremented.
                    counter++;
                }
            }
                return counter;
        }
    public static void main(String[] args){
        int[] arr = new int[]{1,2,3,2,5};
        System.out.println(count(2,arr));
    }
}
