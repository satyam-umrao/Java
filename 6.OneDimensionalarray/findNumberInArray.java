import java.util.Scanner;

public class findNumberInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size : ");
        int size = sc.nextInt();

        // array initialize
        int arr[] = new int[size];

        // input
        System.out.print("Enter array elements : ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        // number to find
        System.out.print("Enter number to find : ");
        int num = sc.nextInt();

        // find number in array
        for (int i = 0; i < size; i++) {
            if (arr[i] == num) {
                System.out.print("Number found at index %d".formatted(i));
                break;
            }
            sc.close();
        }
    }
}

// <<<--------------------------------Output-------------------------------->>>

// Enter array size : 5
// Enter array elements : 1 2 3 4 5
// Enter number to find : 4
// Number found at index 3
