package Java_strings;
import java.util.*;

public class all_methods {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        // Taking input of a string
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.println("Your name is %s".formatted(name));

        //length of string
        System.out.println("Length of your name is %d".formatted(name.length()));

        //substring (slicing a string)
        System.out.print("Enter starting index for substring: ");
        int start = sc.nextInt();
        System.out.print("Enter ending index for substring: ");
        int end = sc.nextInt();
        String sub = name.substring(start, end);
        System.out.println("The substring is: %s".formatted(sub));

        //replace
        sc.nextLine(); // consume the newline
        System.out.print("Enter the character to be replaced: ");
        String toReplace = sc.nextLine();
        System.out.print("Enter the new character: ");
        String newChar = sc.nextLine();
        String replacedString = name.replace(toReplace, newChar);
        System.out.println("The new string is: %s".formatted(replacedString));

        //toUpperCase
        String upperCaseName = name.toUpperCase();
        System.out.println("Name in uppercase: %s".formatted(upperCaseName));

        //toLowerCase
        String lowerCaseName = name.toLowerCase();
        System.out.println("Name in lowercase: %s".formatted(lowerCaseName));

        //trim
        System.out.print("Enter a string with leading and trailing spaces: ");
        String spacedString = sc.nextLine();
        String trimmedString = spacedString.trim();
        System.out.println("Trimmed string: '%s'".formatted(trimmedString));

        // //charAt
        System.out.print("Enter an index to get the character at that position: ");
        int index = sc.nextInt();
        char ch = name.charAt(index);
        System.out.println("Character at index %d is '%c'".formatted(index, ch));

        // compare two strings
        System.out.print("Enter another name to compare: ");
        String anotherName = sc.nextLine();
        if(name.equals(anotherName)){
            System.out.println("Both names are equal.");
        } else {
            System.out.println("Names are not equal.");
        }



        sc.close();
    }
     
}
