// move all x to end of string
public class xToEnd {
    public static void move(int idx, String a, int count, String str) {
        if (idx == a.length()) {
            for (int i = 0; i < count; i++) {
                str = str + "x";
            }
            System.out.println(str);
            return;
        }
        if (a.charAt(idx) == 'x') {
            count = count + 1;
            move(idx + 1, a, count, str);
        } else {
            str = str + a.charAt(idx);
            move(idx + 1, a, count, str);
        }
    }

    public static void main(String[] args) {
        String a = "jxxhgxsxnx";
        String str = new String("");
        move(0, a, 0, str);
    }
}
