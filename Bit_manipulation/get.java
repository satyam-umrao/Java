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

// <<<---------------------Output--------------------->>>
// Bit is Zero
// <<<------------------------------------------------>>>

// <-------------Logic-------------->
// number = 5 = 0101
// required bit =3
// 1 = 0001

// Step 1 ------------->
// so, 1 << required bit
// that is, 0001 << 3
// Answer = 1000

// Step 2 ------------->
// answer & number
// 1000 & 0101
// ---> 0000

// if output is zero then bit is 0.
// else, bit is one.