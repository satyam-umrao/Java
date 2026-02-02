// assignment operators in java ------->
// --------------------------------------------------------------------------
// =   (Assignment)           | Assigns value from right to left.           |
// +=  (Add and Assign)       | Adds right operand to left and assigns.     |
// -=  (Subtract and Assign)  | Subtracts right from left and assigns.      |
// *=  (Multiply and Assign)  | Multiplies left by right and assigns.       |
// /=  (Divide and Assign)    | Divides left by right and assigns.          |
// %=  (Modulus and Assign)   | Takes modulus of left by right and assigns. |
// --------------------------------------------------------------------------

package operators;

public class assignment {
    public static void main(String[] args) {
        // Assignment (=) example
        int x = 10;
        System.out.println("Initial value of x: " + x);

        // Add and Assign (+=) example
        x += 5; // x = x + 5
        System.out.println("After x += 5: " + x);

        // Subtract and Assign (-=) example
        x -= 3; // x = x - 3
        System.out.println("After x -= 3: " + x);

        // Multiply and Assign (*=) example
        x *= 2; // x = x * 2
        System.out.println("After x *= 2: " + x);

        // Divide and Assign (/=) example
        x /= 4; // x = x / 4
        System.out.println("After x /= 4: " + x);

        // Modulus and Assign (%=) example
        x %= 3; // x = x % 3
        System.out.println("After x %= 3: " + x);
    }
}
