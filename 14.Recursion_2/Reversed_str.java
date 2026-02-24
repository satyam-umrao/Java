public class Reversed_str {
    public static void reverse(String a, int index) {
        if (index == 0) {
            System.out.print(a.charAt(index));
            return;
        }
        System.out.print(a.charAt(index));
        reverse(a, index - 1);
    }

    public static void main(String[] args) {
        String a = "Satyam";
        int index = a.length() - 1;
        reverse(a, index);
    }
}

// Output
//
// maytaS