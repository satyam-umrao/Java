package functions;
import java.util.Scanner;

public class SumOfAllOdds {
    public static int OddSum(int n){
        int a = 0;
        for(int i=1 ; i<=n ; i++){
            if(i%2 != 0){
                a=a+i;
            }
        }
        return a;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Range : ");
        int n = sc.nextInt();
        int Sum = OddSum(n);
        System.out.println("Sum of all odd numbers from 1 to %d id %d".formatted(n,Sum));
        sc.close();
    }
}
