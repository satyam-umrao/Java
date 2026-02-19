import java.util.Scanner;

public class fibonaci {
    public static void fib(int n, int start, int next) {
        int num = start + next;
        if (num > n) {
            return;
        }
        System.out.print(num + " ");
        start = next;
        next = num;
        fib(n, start, next);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number : ");
        int n = sc.nextInt();

        int start = 0;
        int next = 1;
        System.out.print(start + " ");
        System.out.print(next + " ");
        fib(n, start, next);
        sc.close();
    }
}

// output
// Enter any number : 22
// 0 1 1 2 3 5 8 13 21