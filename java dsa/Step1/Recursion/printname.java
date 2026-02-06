//Printing name N times using recursion.
//Making function for recusion

    
//This is normal recusion parametrzied recusion and there is backtracking (n-1) 
import java.util.*;

public class printname{
        
        public static void print(int n , String name){
            if(n==0){
                return;
            }
            System.out.println(name);
            
            print(n-1,name);
        }  
        public static void main(String args[]){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the name");
            String name = sc.next();
            int n = sc.nextInt();
            print(n , name);
        }   
}