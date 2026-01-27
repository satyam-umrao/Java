package functions;

import java.util.*;

public class fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to find Fibonacci series up to that number: ");
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        int c;
        System.out.println("Fibonacci series up to " + n + ":");
        System.out.print(a+" ");
        System.out.print(b+" ");
        for (int i = 0; i < n-2; i++) {
            c=a+b;
            System.out.print(c+" ");
            a=b;
            b=c;
        }
        sc.close();
    }

//  <<<------------------------------------Output------------------------------------>>>

// Enter a number to find Fibonacci series up to that number: 10
// Fibonacci series up to 10:
// 0 1 1 2 3 5 8 13 21 34 
 

}
