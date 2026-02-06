//Printing sum of N numbers using recursion.

//This is normal parametrzed  recusion with backtracking. 


public class sumNum{
        
        static void SumN(int i , int n , int sum){
        
        if(i>n){
            System.out.println(sum);
            return;
        }
        sum = sum + n;
        SumN(i,n-1,sum);
}
    public static void main (String[] args){
            SumN(1,5,0);
    } 
} 