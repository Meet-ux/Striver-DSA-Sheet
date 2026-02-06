//Printing name N times using recursion.

//This is normal recusion parametrzied recusion and no backtracking 
import java.util.*;
public class printname2{

        public static void prName(int i , int n , String name){
        if(i>n){
            return;
        }
        System.out.println(name);
        prName(i+1,n,name);
    }
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        String name = sc.next(); 

        
        prName(1,5,name);
    } 
}