package arrays;

import java.util.Scanner;

public class inputInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size : ");
        int size = sc.nextInt();
 
        // array initialize
        int arr[] = new int[size];

        // input
        System.out.print("Enter array elements : ");
        for(int i=0 ; i<size ; i++){
            arr[i] = sc.nextInt();
        }

        // output
        System.out.print("Array elements are : ");
        for(int i=0 ; i<size ; i++){
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}


// <<<-----------------------Output----------------------->>>
