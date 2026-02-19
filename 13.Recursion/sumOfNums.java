import java.util.Scanner;

public class sumOfNums {

    public static void sumOfNaturalNumbers(int n, int count) {
        if (n == 0) {
            System.out.println("Sum is: %d".formatted(count));
            return;
        }
        count = count + n;
        sumOfNaturalNumbers(n - 1, count);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int count = 0;
        sumOfNaturalNumbers(n, count);
        sc.close();
    }
}

// Output
//
// Enter a number: 5
// Sum is: 15
