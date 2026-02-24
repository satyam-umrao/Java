public class TowerOfHanoi {
    public static void Hanoi(int n, String start, String helper, String destination) {
        if (n == 1) {
            System.out.println("transfer of %s to %s".formatted(start, destination));
            return;
        }
        Hanoi(n - 1, start, destination, helper);
        System.out.println("Transfer of %s to %s".formatted(start, destination));
        Hanoi(n - 1, helper, start, destination);
    }

    public static void main(String[] args) {
        int n = 2;
        String start = "S";
        String helper = "h";
        String destination = "d";
        Hanoi(n, start, helper, destination);
    }
}
