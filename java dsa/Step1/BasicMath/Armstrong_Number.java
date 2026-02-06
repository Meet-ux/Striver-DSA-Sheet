import java.util.*;
public class Armstrong_Number{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int temp = n;
        int temp1 = n;
        int sum = 0;
        int count = 0;
        while(temp>0){
            count++;
            temp = temp/10;
        }
        while(n>0){
            int ld = n%10;
            sum = sum + (int) Math.pow(ld,count);
            n = n/10;
        }
        if(sum==temp1){
            System.out.println("Yes Armstrong");
            System.out.println(sum);
            System.out.println(temp1);
        }
        else{
            System.out.println("Not Armstrong");
            System.out.println(sum);
            System.out.println(temp1);
        }
        sc.close();
    }
}