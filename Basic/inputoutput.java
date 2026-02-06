import java.util.*;
public class inputoutput{
    public static void main(String[] args) {
        // Create Scanner object for input
        Scanner sc = new Scanner(System.in);

        // Take integer input
        System.out.print("Enter an integer: ");
        int num = sc.nextInt();

        // Take float input
        System.out.print("Enter a float: ");
        float decimal = sc.nextFloat();

        // Clear input buffer before nextLine
        sc.nextLine(); 

        // Take string input (whole line)
        System.out.print("Enter your full name: ");
        String name = sc.nextLine();
        sc.close();
        // Output all values
        System.out.println("\n--- Output ---");
        System.out.println("Integer: " + num);
        System.out.println("Float: " + decimal);
        System.out.println("Name: " + name);
    }
}
