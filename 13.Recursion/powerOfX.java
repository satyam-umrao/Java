import java.util.Scanner;

public class powerOfX {
    public static int power(int x, int n) {
        if (n == 0) {
            return 1;
        }
        if (x == 0) {
            return 0;
        }
        int CalcPower = power(x, n - 1);
        int cal = (x * CalcPower);
        return cal;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the base (x): ");
        int x = sc.nextInt();
        System.out.print("Enter the exponent (n): ");
        int n = sc.nextInt();

        int result = power(x, n);
        System.out.println(result);

        sc.close();
    }
}

// output
//
// Enter the base (x): 5
// Enter the exponent (n): 4
// 625