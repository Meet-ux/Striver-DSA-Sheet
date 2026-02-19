public class practice {
    public static void allDivisors(int Num){
        int count = 0;
        for(int i=1;i<=Num;i++){
            if (Num%i==0) {
                count++;
            }
        }
        if (count>2) {
            System.out.println("Not Prime");
        }
        else{
            System.out.println("Its A prime number");
        }

    };

    public static void recursionNamePrint(String name, int times, int count ){
        
        if (count==times) {
            return;
        }
        System.out.println(name);
        count++;
        recursionNamePrint(name, times , count);
    }

    public static void Print1toN(int N, int init){
        if (init>N) {
            return;
        }
        System.out.println(init);
        Print1toN(N, init+1);
    }
    public static void PrintNto1(int N, int init){
        if (init==N) {
            return;
        }
        System.out.println(N);
        Print1toN(N-1, init);
    }
    public static int sumNnum(int N, int sum){
        if(N==0){
            return sum;
        }
        sum = sum + N;
        return sumNnum(N-1,sum);
        
    }
    public static int factorial(int N, int fact){
        if (N==0) {
            return fact;
        }
        fact = fact*N;
        return factorial(N-1, fact);
    }

    public static void revArr(int arr[]){
        int p1 = 0;
        int p2 = arr.length-1;
        for(int i = 0; i<arr.length;i++){
            if (p1<p2) {
                int temp = arr[p1];
                arr[p1] = arr[p2];
                arr[p2] = temp;
                p1++;
                p2--;
            }
        }
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }

    public static boolean stringPal(int i , String s){
        if (i>=s.length()/2) {
            return true;
        }
        if (s.charAt(i)!=s.charAt(s.length()-i-1)) {
            return false;
        }
        return stringPal(i+1, s);
    }

    public static int fibbonacciSeries(int N){
        if (N<=1) {
            return N;
        }
        return fibbonacciSeries(N-1)+fibbonacciSeries(N-2);
    }

    public static void main(String[] args) {
        

        // allDivisors(4);
        // recursionNamePrint("Meet", 5 ,0);
        // PrintNto1(5, 0);
        //Print1toN(5, 1);
        //System.out.println(sumNnum(5, 0));
        //System.out.println(factorial(5, 1));

        // int arr[]  = new int[]{1,3,4,5,6};
        // revArr(arr);
        // System.out.println(stringPal(0, "MADAM"));

       System.out.println( fibbonacciSeries(5));
    }
}
