// Bit Manipulation - Get Bit
// And Operation

// Example: Get the 3rd bit of number 5 (0101 in binary)
// 1<<i
package Bit_manipulation;

public class get {
    public static void main(String[] args) {
        int a = 5;
        int bit = 3;
        int left_shifted = 1 << bit;

        int result = left_shifted & a;
        if (result == 0) {
            System.out.println("Bit is Zero");
        } else {
            System.out.println("Bit is One");
        }
    }
}
