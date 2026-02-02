// Airthemetic operators in Java
// -------------------------------------------------------------------------
// 1. Addition (+)          | performs addition between two numbers        |
// 2. Subtraction (-)       | performs subtraction between two numbers     |
// 3. Multiplication (*)    | performs multiplication between two numbers  |
// 4. Division (/)          | performs division between two numbers        |
// 5. Modulus (%)           | finds remainder after division               |
// -------------------------------------------------------------------------
// unary operators                                                         |
// 1. Increment (++)  {++x (Pre-increment) or x++ (Post-increment)}        | 
// 2. Decrement (--)  {--x (Pre-decrement) or x-- (Post-decrement)}        |
// -------------------------------------------------------------------------
package operators;

public class airthemetic {

    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        // Addition
        int sum = a + b;
        System.out.println("Addition: " + sum);

        // Subtraction
        int difference = a - b;
        System.out.println("Subtraction: " + difference);

        // Multiplication
        int product = a * b;
        System.out.println("Multiplication: " + product);

        // Division
        int quotient = a / b;
        System.out.println("Division: " + quotient);

        // Modulus
        int remainder = a % b;
        System.out.println("Modulus: " + remainder);

        // Increment
        int preIncrement = ++a; // Pre-increment
        System.out.println("Pre-increment: " + preIncrement);

        int postIncrement = b++; // Post-increment
        System.out.println("Post-increment: " + postIncrement);
        System.out.println("Value of b after post-increment: " + b);

        // Decrement
        int preDecrement = --a; // Pre-decrement
        System.out.println("Pre-decrement: " + preDecrement);

        int postDecrement = b--; // Post-decrement
        System.out.println("Post-decrement: " + postDecrement);
        System.out.println("Value of b after post-decrement: " + b);
    }
}

// <<<------------------------Output------------------------>>>