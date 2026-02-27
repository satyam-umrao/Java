// Permutations of a string

public class permutations {
    public static void permutate(String a, String permuString) {
        if (a.length() == 0) {
            System.out.println(permuString);
            return;
        }
        for (int i = 0; i <= a.length(); i++) {
            char currentChar = a.charAt(i);
            String newChar = a.substring(0, i) + a.substring(i + 1);
            permutate(newChar, permuString + currentChar);
        }
    }

    public static void main(String[] args) {
        String a = "ABC";
        permutate(a, "");
    }
}
