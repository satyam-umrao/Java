
import java.util.*;

public class one {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 1 number : ");
        int a = sc.nextInt();
        System.out.print("Enter 2 number : ");
        int b = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter your Choice : ");
        System.out.print("add, mul, sub, div\nchoice : ");
        String c = sc.nextLine();
        switch (c) {
            case "add":
                System.out.println(a + b);
                break;
            case "sub":
                System.out.println(a - b);
                break;
            case "mul":
                System.out.println(a * b);
                break;
            case "div":
                System.out.println(a / b);
                break;
            default:
                System.out.println("Ibnvalid Choice");
        }

        sc.close();
    }
}