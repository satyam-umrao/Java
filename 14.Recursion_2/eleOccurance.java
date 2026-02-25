public class eleOccurance {
    public static int first = -1;
    public static int last = -1;

    public static void occurance(String a, int idx, char elem) {
        if (idx == a.length()) {
            System.out.println(first);
            System.out.println(last);
            return;
        }
        char current = a.charAt(idx);
        if (current == elem) {
            if (first == -1) {
                first = idx;
            } else {
                last = idx;
            }
        }
        occurance(a, idx + 1, elem);
    }

    public static void main(String[] args) {
        String a = "jhasdfgashdf";
        char elem = 's';
        occurance(a, 0, elem);
    }
}
