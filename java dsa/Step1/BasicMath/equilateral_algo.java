import java.util.*;

public class equilateral_algo{
    public static void main(String[] args){
        

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number 1: ");
        int n1 = sc.nextInt();
        System.out.print("Enter a number 2: ");
        int n2 = sc.nextInt();
        int gcd;
        while(n1>0&&n2>0){
            if(n1>n2){
                n1 = n1%n2;
            }
            else{
                n2 = n2%n1;
            }
        }
        if(n1==0){
            gcd = n2;
            System.out.println(gcd);
        }
        else{
            gcd = n1;
            System.out.println(gcd);
        }
        sc.close();
    }
}