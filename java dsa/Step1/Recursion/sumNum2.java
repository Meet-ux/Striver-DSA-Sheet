public class sumNum2{

    static int SumN(int i, int n) {
        if (i > n) {
            return 0;  // base case
        }
        return i + SumN(i + 1, n); // recursive call
    }

    public static void main(String[] args) {
        int result = SumN(1, 5);
        System.out.println(result + " Using functional recursive call");
    }
}
