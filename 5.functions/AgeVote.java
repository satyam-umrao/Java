import java.util.Scanner;

public class AgeVote {
    public static String isEligibleToVote(int age) {
        if (age >= 18 && age <= 60) {
            if (age >= 60) {
                return ("You are a senior citizen but eligible to vote.");
            }
            return ("You are eligible to vote.");
        } else {
            return ("You are not eligible to vote.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        String result = isEligibleToVote(age);
        System.out.println(result);
        sc.close();
    }
}

// <<<-----------------------------------Output----------------------------------->>>
//
// Enter your age: 19
// You are eligible to vote.