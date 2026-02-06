import java.util.*;
public class count_digits{
    public static void main (String[] args){
        //First of Init an counter variable
        int count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        //Now we will run a while loop till n becomes 0
        while(n>0){
            // int ld = n%10;
            count++;
            n = n/10;
        }
        System.out.println(count);
        sc.close();
    }
}