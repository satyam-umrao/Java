import java.util.*;

public class fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to find Fibonacci series up to that number: ");
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        int c;
        if (n > 0) {
            System.out.println("Fibonacci series up to " + n + ":");
            System.out.print(a + " ");
            System.out.print(b + " ");
            for (int i = 1; i < n; i++) {
                c = a + b;
                if (c > n)
                    break;
                System.out.print(c + " ");
                a = b;
                b = c;
            }
        } else {
            System.out.println("Please enter a positive integer greater than 0.");
        }
        sc.close();
    }

    // <<<------------------------------------Output------------------------------------>>>

    // Enter a number to find Fibonacci series up to that number: 22
    // Fibonacci series up to 22:
    // 0 1 1 2 3 5 8 13 21

}
