// logical operators ------->
// ---------------------------------------------------------
// && (Logical AND) | True if both operands are true.      |
// || (Logical OR)  | True if at least one operand is true.|
// ! (Logical NOT)  | True if the operand is false.        |
// ---------------------------------------------------------

package operators;

public class logical {
    public static void main(String[] args) {
        // Logical AND (&&) example
        boolean a = true;
        boolean b = false;
        boolean andResult = a && b; // false
        System.out.println("Logical AND (true && false): " + andResult);

        // Logical OR (||) example
        boolean orResult = a || b; // true
        System.out.println("Logical OR (true || false): " + orResult);

        // Logical NOT (!) example
        boolean notResult = !a; // false
        System.out.println("Logical NOT (!true): " + notResult);
    }
}

// <<<---------------------------Output--------------------------->>>
//
// Logical AND (true && false): false
// Logical OR (true || false): true
// Logical NOT (!true): false