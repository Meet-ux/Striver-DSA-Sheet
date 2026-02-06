import java.util.*;

public class gcd{
    public static void main(String[] args){
        
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number 1: ");
        int n1 = sc.nextInt();
        System.out.print("Enter a number 2: ");
        int n2 = sc.nextInt();
        int gcd  = 1;
        for(int i = 1; i<=Math.min(n1,n2);i++){
            if(n1%i==0&&n2%i==0){
                if(i>gcd){
                    gcd = i;
                }
            }
        }    
        System.out.println(gcd);
        sc.close();
    }
}