import java.util.Scanner;

public class syntax2d {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // input no of rows and columns
        System.out.print("Enter no of rows : ");
        int rows = sc.nextInt();
        System.out.print("Enter no of columns : ");
        int columns = sc.nextInt();

        // matrix initialize
        int matrix[][] = new int[rows][columns];

        // Input matrix elements
        System.out.println("Enter matrix Elements : ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // output matrix elements
        System.out.println("Matrix elements are : ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println("");
        }
        sc.close();
    }
}

// <<<-----------------------Output----------------------->>>

// Enter no of rows : 3
// Enter no of columns : 4
// Enter matrix Elements :
// 1 2 3 4
// 4 3 2 1
// 5 6 7 8
// Matrix elements are :
// 1 2 3 4
// 4 3 2 1
// 5 6 7 8
