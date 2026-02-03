// Bit Manipulation - Set bit
// OR operation

// Question -> set the bit at position 1 in the number 5
// number = 5, bit_position = 1

package Bit_manipulation;

public class set {
    public static void main(String[] args) {
        int number = 5;
        int bit_position = 1;
        int left_shifted = 1 << bit_position;

        int result = left_shifted | number;
        System.out.println(result);
    }
}

// Output -> 7

// logic --------------->
// 1 = 0001
// bit_position = 1
// n = 5 = 0101

// Step 1.
// left_shifted = 1 << bit_position
// Answer = 0010

// Step 2.
// result = left_shifted | n
// result = 0010 | 0101
// result = 0111 = 7