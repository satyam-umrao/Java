package java_stringbuilder;

import java.util.Scanner;

public class allmethods {
    public static void main(String[] args) {
        // print string
        StringBuilder name = new StringBuilder("Satyam Umrao");
        System.out.println(name);

        // take string input and print name
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name : ");
        StringBuilder name1 = new StringBuilder(sc.nextLine());
        System.out.println("Your name is %s".formatted(name1));

        // find length
        System.out.println(name.length());

        // find any character at any index (CharAt)
        System.out.println(name.charAt(3));

        // substring or slicing
        System.out.println(name.substring(0,7));

        // append
        name.append(" umrao");
        System.out.println(name);

        //repeating any string
        System.out.println(name.repeat(name, 10));

        //delete
        System.out.println(name.delete(0, 7));
        
        //insert
        System.out.println(name.insert(0, "Mr. "));

        // reverse
        System.out.println(name.reverse());

        // uppercase and lowercase
        System.out.println(name.toString().toUpperCase());
        System.out.println(name.toString().toLowerCase());





        sc.close();
    }
}
