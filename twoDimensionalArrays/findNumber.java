package twoDimensionalArrays;
import java.util.Scanner;

public class findNumber {
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
        for(int i=0 ; i<rows ; i++){
            for(int j=0 ; j<columns ; j++){
                 matrix[i][j] = sc.nextInt();
            }
        }
        
        // input required number
        System.out.print("Enter number to find : ");
        int num = sc.nextInt();

        // output matrix elements
        for(int i=0 ; i<rows ; i++){
            for(int j=0 ; j<columns; j++){
                if(matrix[i][j] == num){
                    System.out.print("Number found at (%d,%d) position".formatted(i+1,j+1));
                }
            }
        } 
        sc.close();
    }
}