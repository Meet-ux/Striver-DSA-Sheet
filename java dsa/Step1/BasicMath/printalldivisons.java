import java.util.*;
public class printalldivisons{
    public static void main (String[] args){
        ArrayList<Integer> obj1 = new ArrayList<>();
        // int count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        for(int i = 1; i*i<=n;i++){
            if(n%i==0){
                obj1.add(i);
                if(n/i != i){
                    obj1.add(n/i);
                }
            }
            
        }
        //Printed in unsorted form
        System.out.println(obj1);

        //Using Sorting technique
        Collections.sort(obj1);
        System.out.println(obj1);
        sc.close();
    }
}