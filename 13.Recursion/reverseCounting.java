import java.util.*;

public class reverseCounting {

    public static void reverse(int a) {
        if (a == 0) {
            return;
        }
        System.out.print(a + " ");
        reverse(a - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number : ");
        int a = sc.nextInt();

        reverse(a);
        sc.close();
    }
}

// Output
//
// Enter any number : 5
// 5 4 3 2 1