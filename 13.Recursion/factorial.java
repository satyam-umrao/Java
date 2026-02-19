import java.util.Scanner;

public class factorial {
    public static void factorial(int n, int count) {
        if (n == 0 || n == 1) {
            System.out.println("Factorial is : %d".formatted(count));
            return;
        }
        count = count * n;
        factorial(n - 1, count);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int count = 1;
        factorial(n, count);
        sc.close();
    }
}

// optput
//
// Enter a number: 5
// Factorial is : 120