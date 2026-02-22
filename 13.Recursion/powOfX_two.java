import java.util.Scanner;

public class powOfX_two {
    public static int pow(int x, int n) {
        if (n == 0) {
            return 1;
        }
        if (x == 0) {
            return 0;
        }

        if (n % 2 == 0) {
            return pow(x, n / 2) * pow(x, n / 2);
        } else {
            return pow(x, n / 2) * pow(x, n / 2) * x;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of x: ");
        int x = sc.nextInt();
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        int result = pow(x, n);
        System.out.println(result);

        sc.close();
    }
}

// Output
//
// Enter the value of x: 5
// Enter the value of n: 4
// 625