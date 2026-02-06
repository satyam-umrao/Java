import java.util.Scanner;

public class average {
    public static int Average(int a, int b) {
        int average = (a + b) / 2;
        return average;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int a = sc.nextInt();
        System.out.print("Enter Second number : ");
        int b = sc.nextInt();
        int c = Average(a, b);
        System.out.println("Average of %d and %d is %d".formatted(a, b, c));
        sc.close();
    }
}

// <<<-----------------------------------Output----------------------------------->>>

// Enter first number : 12
// Enter Second number : 14
// Average of 12 and 14 is 13
