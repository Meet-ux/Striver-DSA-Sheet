import java.util.*;
public class palindrome{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int temp = n;
        int revnum = 0;
        //Now we will run a while loop till n becomes 0
        while(n>0){
            int ld = n%10;
            revnum = revnum*10 + ld; 
            n = n/10;
        }
        
        if(revnum==temp){
            System.out.println("Yes palindrome");
            System.out.println(revnum);
            System.out.println(temp);
        }
        else{
            System.out.println("Not a palindrome");
            System.out.println(revnum);
            System.out.println(temp);

        }
        sc.close();
    }
}