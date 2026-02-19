import java.util.Scanner;

public class sumOfNums {

    public static void sumOfNaturalNumbers(int n, int count) {
        if (n == 0) {
            System.out.println(count);
            return;
        }
        count = count + n;
        sumOfNaturalNumbers(n - 1, count);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        sumOfNaturalNumbers(n, count);
        sc.close();
    }
}
