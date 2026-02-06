public class startpatterns {
    static void pattern1(int n ){
        for(int i = 0 ; i<n ;i++){
            for(int j = 0 ; j<n ;j++){
            
            System.out.print("*"+" ");
        }
            System.out.println();
        }
    }
    static void pattern2(int n ){
        for(int i = 0 ; i<n ;i++){
            for(int j = 0 ; j<=i ;j++){
            
            System.out.print("*"+" ");
        }
            System.out.println();
        }
    }
    static void pattern3(int n ){
        for(int i = 0 ; i<=n ;i++){
            for(int j = 1 ; j<=i ;j++){
            
            System.out.print(j+" ");
        }
            System.out.println();
        }
    }
    static void pattern4(int n ){
        for(int i = 0 ; i<=n ;i++){
            for(int j = 1 ; j<=i ;j++){
            
            System.out.print(i+" ");
        }
            System.out.println();
        }
    }
    static void pattern5(int n ){
        for(int i = n ; i>0 ;i--){
            for(int j = 0 ; j<i ;j++){
            
            System.out.print("*"+" ");
        }
            System.out.println();
        }
    }
    static void pattern6(int n ){
        for(int i = n ; i>0 ;i--){
            for(int j = 1 ; j<=i ;j++){
                System.out.print(j+" ");
        }
            if (i <= 1) {
                break;
            }
            System.out.println();
        }
    }
    static void pattern7(int n ){
        for(int i = 0 ; i<=n ;i++){
            //for spaces
            for(int j = 1 ; j<=n-i ;j++){
                System.out.print(" "+" ");
        }
            //for stars
            for(int j = 1 ; j<=2*i+1 ;j++){
                System.out.print("*"+" ");
        }
            //for spaces
            for(int j = 1 ; j<=n-i ;j++){
                System.out.print(" "+" ");
        }

            System.out.println();
        }
    }
    static void pattern8(int n ){
        for(int i = n ; i>=0 ;i--){
            //for spaces
            for(int j = 1 ; j<=n-i ;j++){
                System.out.print(" "+" ");
        }
            //for stars
            for(int j = 1 ; j<=2*i+1 ;j++){
                System.out.print("*"+" ");
        }
            //for spaces
            for(int j = 1 ; j<=n-i ;j++){
                System.out.print(" "+" ");
        }

            if (i == 0) {
                break;
            }
            System.out.println();
        }
    }
    static void pattern9(int n ){
        //For upper body
        for(int i = 0 ; i<n ;i++){
            //for spaces
            for(int j = 1 ; j<=n-i ;j++){
                System.out.print(" "+" ");
        }
            //for stars
            for(int j = 1 ; j<=2*i+1 ;j++){
                System.out.print("*"+" ");
        }
            //for spaces
            for(int j = 1 ; j<=n-i ;j++){
                System.out.print(" "+" ");
        }

            System.out.println();
        }
    
        //For lower body
        for(int i = n-1 ; i>=0 ;i--){
            //for spaces
            for(int j = 1 ; j<=n-i ;j++){
                System.out.print(" "+" ");
        }
            //for stars
            for(int j = 1 ; j<=2*i+1 ;j++){
                System.out.print("*"+" ");
        }
            //for spaces
            for(int j = 1 ; j<=n-i ;j++){
                System.out.print(" "+" ");
        }

            System.out.println();
        }
    }
    static void pattern10(int n){
        //For upper body 
        for(int i = 0; i<n ; i++){
            for(int j = 0; j<i ; j++){
                System.out.print("*"+" ");
        }
            System.out.println();
        }
        //for lower body
        for(int i = n; i>0 ; i--){
            for(int j = 0; j<i ; j++){
                System.out.print("*"+" ");
        }
            System.out.println();
        }
    }
    static void pattern11(int n ){
        int bin = 1;
        for(int i = 0 ; i<n ;i++){
            for(int j = 0 ; j<=i ;j++){
                System.out.print(bin+" ");
            if (bin == 0) {
                bin=1;
            }
            else if (bin == 1) {
                bin=0;
            }
        }
            System.out.println();
        }
    }
    static void pattern12(int n ){
    for(int i = 1 ; i<n ;i++){
            //For right digits
            for(int j = 1 ; j<=i ;j++){
                System.out.print(j+" ");
        }
            //For spaces
            for(int j = 1 ; j<=n+3-(2*i) ;j++){
                System.out.print(" "+" ");
        }
            //For Left digits
            for(int j = i ; j>=1 ;j--){
                System.out.print(j+" ");
        }
            System.out.println();}

}
    static void pattern13(int n ){
        int a = 1;
        for(int i = 1; i<=n ;i++){
            for(int j = 1 ; j<=i ;j++){
                System.out.print(a+" ");
                a++;
        }
            System.out.println();
        }
    }
    static void pattern14(int n ){
        
        for(int i = 0; i<n ;i++){
            for(char j = 'A'  ; j<='A'+i ;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    static void pattern15(int n ){
        for(int i = n-1; i>=0 ;i--){
            for(char j = 'A'  ; j<='A'+i ;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    static void pattern16(int n ){
        
        for(int i = 0; i<n ;i++){
                char ch  = (char) ('A' + i);
                for(int j = 0; j<=i ;j++){ 
                    System.out.print(ch);
                } 
            System.out.println();
        }
    }
    static void pattern17(int n ){
        for(int i = 0 ; i<=n ;i++){
            //for spaces
            for(int j = 1 ; j<=n-i ;j++){
                System.out.print(" "+" ");
        }
            char ch  = 'A';
            // int breakpoint = ((2*i)+1)/2;
            for(int j = 1; j<=(2*i)+1 ;j++){ 
                    System.out.print(ch+" ");
                    if (j<=n) {
                        ch++;
                    } else {
                        ch--;
                    }
            }
            //for spaces
            for(int j = 1 ; j<=n-i ;j++){
                System.out.print(" ");
        }

            System.out.println();
        }
    }
    static void pattern18(int n ){
        for(int i = 0 ; i<n ; i++){
            for(char ch  = (char) ('E' - i) ; ch<='E' ; ch++){
            System.out.print(ch+" ");
        }
            System.out.println();
        }
}
    static void pattern19(int n ){
        //FOR UPPER BODY
        for(int i = 0 ; i<n ; i++){
            //For stars 
            for(int j = 1 ; j<=n-i ; j++){
            System.out.print("*"+" ");
        }
            //For space 
            for(int j = 1 ; j<(2*i)+1 ; j++){
            System.out.print(" "+" ");
        }
            //For stars
            for(int j = 1 ; j<=n-i ; j++){
            System.out.print("*"+" ");
        }
            System.out.println();
            
        }
        //FOR LOWER BODY
        for(int i = n-1 ; i>=0 ; i--){
            //For stars 
            for(int j = 1 ; j<=n-i ; j++){
            System.out.print("*"+" ");
        }
            //For space 
            for(int j = 1 ; j<(2*i)+1 ; j++){
            System.out.print(" "+" ");
        }
            //For stars
            for(int j = 1 ; j<=n-i ; j++){
            System.out.print("*"+" ");
        }
            System.out.println();
        }
            
}
    static void pattern20(int n ){
       //FOR Upper BODY
        for(int i = n-1 ; i>=0 ; i--){
            //For stars 
            for(int j = 1 ; j<=n-i ; j++){
            System.out.print("*"+" ");
        }
            //For space 
            for(int j = 1 ; j<(2*i)+1 ; j++){
            System.out.print(" "+" ");
        }
            //For stars
            for(int j = 1 ; j<=n-i ; j++){
            System.out.print("*"+" ");
        }
            System.out.println();
        }
         //FOR Lower BODY
        for(int i = 1 ; i<n ; i++){
            //For stars 
            for(int j = 1 ; j<=n-i ; j++){
            System.out.print("*"+" ");
        }
            //For space 
            for(int j = 1 ; j<(2*i)+1 ; j++){
            System.out.print(" "+" ");
        }
            //For stars
            for(int j = 1 ; j<=n-i ; j++){
            System.out.print("*"+" ");
        }
            System.out.println();
            
        }
            
}
    static void pattern21(int n ){
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
            if(i==0||j==0||i==n-1||j==n-1){
                System.out.print("*"+" ");
            }
            else{
                System.out.print(" "+" ");
            }    
        }
            if (i == n - 1) {
                break;
            }
            System.out.println();
        }
        
    }
    static void pattern22(int n){
        for(int i = 0 ; i<2*n-1 ; i++ ){
            for(int j = 0 ; j<2*n-1 ; j++ ){
                int top = i;
                int bottom = (2*n-2)-i;

                int left = j;
                int right =(2*n-2)-j;

                int min = n - Math.min(Math.min(right, left) , Math.min(top, bottom));
                System.out.print(min);
        }
                System.out.println();
        }
    }
    public static void main(String[] args) {
        
        pattern19(5);
    }
}
