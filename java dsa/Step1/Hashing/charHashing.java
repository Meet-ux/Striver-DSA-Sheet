//Counting Array Elements frequency using the  Character ArrayHashing.

import java.util.Scanner;
public class charHashing {
    static void chHash(){
        
        //Declaration
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String ");
        String str = sc.next();
        int[] hash = new int[26];//There are only 256 chars worldwide so if we use directly 256 we no need to use subtract a ; or we have to do capital letter hashing we have to subtract 'A'

        //Precompute
        for(int i = 0; i<str.length();i++){
            hash[str.charAt(i)-'a']++;
        }

        //Fetching         
        System.out.println("Enter how many test case you want to see ");
        int t = sc.nextInt();
        while (t-->0) {
            System.out.println("Enter character you want to see frequency");
            char ch = sc.next().charAt(0);
            //This is beacuse hash contains the number so wil subtract a from ch so it will ch - 97 so index will not be out of bound 
            System.out.println(hash[ch-'a']);
        }
        sc.close();
    }
    public static void main(String[] args) {
            chHash();
    }
}
