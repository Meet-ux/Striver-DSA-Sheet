import java.util.*;
public class reversenum{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int revnum = 0;
        //Now we will run a while loop till n becomes 0
        while(n>0){
            int ld = n%10;
            revnum = revnum*10 + ld; 
            
            n = n/10;
        }
        System.out.println(revnum);
        sc.close();
    }
}