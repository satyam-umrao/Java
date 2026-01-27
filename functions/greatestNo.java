package functions;
import java.util.Scanner;

public class greatestNo {
    public static int greatest(int a, int b){
        if (a>b){
            return a;
        }else{
            return b;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers to compare : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = greatest(a, b);
        System.out.println("Greatest number between %d and %d is : %d".formatted(a, b, c));
        sc.close();
    }
}


// <<<-----------------------------------Output----------------------------------->>>
// 
// Enter two numbers to compare : 10 30
// Greatest number between 10 and 30 is 30