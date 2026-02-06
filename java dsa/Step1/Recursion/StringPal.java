public class StringPal {
    public static boolean is_palindrome(String s, int i) {
        int n = s.length();
        if (i >= n / 2) {
            return true;
        }
        if (s.charAt(i) != s.charAt(n - i - 1)) {
            return false;
        }
        return is_palindrome(s, i + 1);
    }

    public static void main(String[] args) {
        
        // if(is_palindrome("HELLO",0)==true){
        //     System.out.println("String is palindrome "); 
        // }
        // else{
        //     System.out.println("String is not palindrome "); 
        // }
    }
}

 