public class TowerOfHanoi {
    public static void Hanoi(int n, String start, String helper, String destination) {
        if (n == 1) { // if n=1 (transfer direct from start to destination)
            System.out.println("transfer of %s to %s".formatted(start, destination));
            return;
        }
        Hanoi(n - 1, start, destination, helper); // first transfer big one to destination
        System.out.println("Transfer of %s to %s".formatted(start, destination));
        Hanoi(n - 1, helper, start, destination); // then transfer small ones to destination through helper
    }

    public static void main(String[] args) {
        int n = 2;
        String start = "S";
        String helper = "h";
        String destination = "d";
        Hanoi(n, start, helper, destination);
    }
}

// Output
//
// transfer of S to h
// Transfer of S to d
// transfer of h to d