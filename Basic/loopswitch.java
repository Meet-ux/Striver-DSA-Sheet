import java.util.Scanner;

public class loopswitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your age");
        int x = sc.nextInt();
        sc.nextLine(); // consume leftover newline
        
        System.out.println("Enter your name");
        String name = sc.nextLine();
        sc.close();
        switch (x) {
            case 18:
                System.out.println("You are an adult");
            case 20:
                System.out.println("You are mature");
                break;
            case 17:
                System.out.println("You are One Step Away");
                break;
            case 16:
                System.out.println("You are Two Step Away");
                break;
            default:
                System.out.println("YOU ARE DEFAULT PIECE");
                break;
        }

        // Do-while loop
        do {
            System.out.println(name + " ");
            break; // otherwise infinite loop if name is "MEET"
        } while (name.equals("MEET"));
    }
}
