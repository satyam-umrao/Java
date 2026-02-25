// Remove Duplicates from array using Recursion
public class removeDuplicates {
    public static boolean[] map = new boolean[26];

    public static void rmd(String a, int idx, String newString) {
        if (idx == a.length()) {
            System.out.println(newString);
            return;
        }
        char currentCharacter = a.charAt(idx);
        if (map[currentCharacter - 'a']) {
            rmd(a, idx + 1, newString);
        } else {
            newString += currentCharacter;
            map[currentCharacter - 'a'] = true;
            rmd(a, idx + 1, newString);
        }
    }

    public static void main(String[] args) {
        String a = "abbabccdacb";
        rmd(a, 0, "");
    }
}

// Output
//
// abcd