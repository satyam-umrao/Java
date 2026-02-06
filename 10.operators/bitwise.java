// Bitwise operators in java
//-------------------------------------------------------------------------------
// & - AND                    | true only if both bits are 1                    |
// | - OR                     | true if at least one bit is 1                   |
// ^ - XOR                    | true if bits are different                      | 
// ~ - NOT                    | inverts all bits                                |
// << - Left Shift            | shifts bits to the left                         |
// >> - Right Shift           | shifts bits to the right                        |
// >>> - Unsigned Right Shift | shifts bits to the right, filling with zeros    |
// ------------------------------------------------------------------------------
public class bitwise {
    public static void main(String[] args) {
        int a = 5; // Binary: 0101
        int b = 3; // Binary: 0011

        // Bitwise AND
        System.out.println("a & b = " + (a & b)); // Output: 1 (Binary: 0001)

        // Bitwise OR
        System.out.println("a | b = " + (a | b)); // Output: 7 (Binary: 0111)

        // Bitwise XOR
        System.out.println("a ^ b = " + (a ^ b)); // Output: 6 (Binary: 0110)

        // Bitwise NOT
        System.out.println("~a = " + (~a)); // Output: -6 (Binary: ...11111010)

        // Left Shift
        System.out.println("a << 1 = " + (a << 1)); // Output: 10 (Binary: 1010)

        // Right Shift
        System.out.println("a >> 1 = " + (a >> 1)); // Output: 2 (Binary: 0010)

        // Unsigned Right Shift
        System.out.println("a >>> 1 = " + (a >>> 1)); // Output: 2 (Binary: 0010)
    }
}

// <<<-----------------------------------Output----------------------------------->>>
//
// a & b = 1
// a | b = 7
// a ^ b = 6
// ~a = -6
// a << 1 = 10
// a >> 1 = 2
// a >>> 1 = 2