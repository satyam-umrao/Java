// Bit Manipulation  - update
// And with Not of bitmask to clear a bit

// Example: n = 15 (1111) , i = 2

public class delete {
    public static void main(String[] args) {
        int n = 15; // 1111
        int i = 2;

        // to clear the ith bit
        int bitmask = ~(1 << i); // [~(0001 << 2)] = [~(0100)] = 1011
        int newNumber = n & bitmask; // 1111 & 1011 = 1011
        System.out.println(newNumber); // 1011 -> 11
    }
}

// <<<--------------------------------Output-------------------------------->>>
// 11
