// calculate the no of paths from (0,0) to (n-1,n-1) in a grid of size n*n
public class paths {
    public static int pathCalc(int i, int j, int n, int m) {
        if (i == n || j == m) {
            return 0;
        }
        if (i == n - 1 && j == m - 1) {
            return 1;
        }
        // move only downwards
        int downpath = pathCalc(i + 1, j, n, m);
        // move only upwards
        int rightPath = pathCalc(i, j + 1, n, m);
        // total paths
        int totalPaths = downpath + rightPath;
        return totalPaths;
    }

    public static void main(String[] args) {
        int n = 4;
        int m = 3;
        int path = pathCalc(0, 0, n, m);
        System.out.println(path);
    }
}

// Output
//
// 10