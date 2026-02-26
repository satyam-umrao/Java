// find number of combination made by pressing n digits on phone keypad
public class keypad {
    public static String keys[] = { ".", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };

    public static void combinations(String n, int idx, String combString) {
        if (idx == n.length()) {
            System.out.println(combString);
            return;
        }
        char current_character = n.charAt(idx);
        String mapping = keys[current_character - '0'];

        for (int i = 0; i < mapping.length(); i++) {
            combinations(mapping, idx + 1, combString + mapping.charAt(i));
        }
    }

    public static void main(String[] args) {
        String n = "23";
        combinations(n, 0, "");
    }
}