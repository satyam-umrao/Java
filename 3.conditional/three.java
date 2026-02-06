import java.util.*;

public class three {
    public static void main(String[] args) {

        // <<<------------ simple if else statement ------------>>>
        // chek +ve or -ve
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int a = sc.nextInt();
        if (a >= 0) {
            System.out.println(a + " is a positive number");
        } else {
            System.out.println(a + " is a negative number");
        }
        sc.close();

        // <<<------------ nested if else statement ------------>>>
        // check which no is greatest among three numbers
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter first number : ");
        // int a = sc.nextInt();
        // System.out.print("Enter second number : ");
        // int b = sc.nextInt();
        // System.out.print("Enter third number : ");
        // int c = sc.nextInt();
        // if (a > b) {
        // if (a > c) {
        // System.out.println(a + " is the greatest number");
        // } else {
        // System.out.println(c + " is the greatest number");
        // }
        // } else {
        // if (b > c) {
        // System.out.println(b + " is the greatest number");
        // } else {
        // System.out.println(c + " is the greatest number");
        // }
        // }
        // sc.close();

    }

}
