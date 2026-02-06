public class syntax {

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3 };
        // output
        for (int i = 0; i < 3; i++) {
            System.out.println(arr[i]);
        }
    }
}

// <<<--------------------Output-------------------->>
// type[] name = new type[size];
// type name[] = new type[size];
// type name[] = {10,20,30,....};

// one
// int arr[]= new int[3];
// arr[0] = 1;
// arr[1] = 2;
// arr[2] = 3;

// two
// int[] arr= new int[3];
// arr[0] = 1;
// arr[1] = 2;
// arr[2] = 3;

// three
// int arr[] = {1,2,3};