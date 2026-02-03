// Bit Manipulation  - update
// Update a bit at a given position to either 0 or 1

// Example:
// Input: n = 5 (binary 101), position = 1, bitIsToUpdate = 1
// Output: 7 (binary 111)
package Bit_manipulation;

public class update {
    public static int updateBit(int n, int position, int bitIsToUpdate) {
        // Create a mask by shifting 1 to the left by 'position' bits
        int mask = 1 << position;

        if (bitIsToUpdate == 1) {
            // Set the bit at 'position' to 1 using bitwise OR
            return n | mask;
        } else {
            // Clear the bit at 'position' to 0 using bitwise AND with NOT mask
            return n & ~mask;
        }
    }

    public static void main(String[] args) {
        int n = 5; // binary 101
        int position = 1;
        int bitIsToUpdate = 1;

        int updatedNumber = updateBit(n, position, bitIsToUpdate);
        System.out.println("Updated number: " + updatedNumber); // Output: 7 (binary 111)
    }
}

// <<<-----------------------Output----------------------->>>
// Updated number: 7