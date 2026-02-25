// find all the substrings of a string
public class subStrings {
    public static void subst(String a, int idx, String newString) {
        if (idx == a.length()) {
            System.out.println(newString);
            return;
        }
        char current_character = a.charAt(idx);
        // choose
        subst(a, idx + 1, newString + current_character);

        // not choose
        subst(a, idx + 1, newString);
    }

    public static void main(String[] args) {
        String a = "abc";
        subst(a, 0, "");
    }
}

// Output
//
// abc
// ab
// ac
// a
// bc
// b
// c
//