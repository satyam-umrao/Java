public class incrArray {
    public static boolean sorted(int arr[], int idx) {
        if (idx == arr.length - 1) {
            return true;
        }
        if (arr[idx] < arr[idx + 1]) {
            return sorted(arr, idx + 1);
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        boolean result = sorted(arr, 0);
        System.out.println(result);
    }
}

// Output
//
// true