import java.util.Scanner;

public class circumferenceOfCircle {
    public static double circumference(double r) {
        double c = 2 * Math.PI * r;
        return c;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius of circle : ");
        double r = sc.nextDouble();
        double c = circumference(r);
        System.out.println("Circumference of circle with radius %.2f is %.2f".formatted(r, c));
        sc.close();
    }
}

// <<<-----------------------------------Output----------------------------------->>>
//
// Enter radius of circle : 7
// Circumference of circle with radius 7.00 is 43.98