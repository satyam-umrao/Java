# Java Strings – Practice Guide

This folder contains **basic Java String operations** implemented using `Scanner` for user input.  
Ideal for beginners and students learning core Java concepts.

---

## 📁 Parent Folder

```java
package Java_strings;
```
## 🧱 Basic Java Program Structure
```java
import java.util.*;

public class all_methods {
    public static void main(String[] args) {

    }
}
```

## ⌨️ Scanner for Input
```java
Scanner sc = new Scanner(System.in);
<------- your code here ----------->
sc.close();
```

## 🧵 Taking Input of a String
```java
System.out.print("Enter your name: ");
String name = sc.nextLine();
System.out.println("Your name is %s".formatted(name));
```

## 📏 Length of String
```java
System.out.println("Length of your name is %d".formatted(name.length()));
```

## ✂️ Substring (Slicing a String)
```java
System.out.print("Enter starting index for substring: ");
int start = sc.nextInt();

System.out.print("Enter ending index for substring: ");
int end = sc.nextInt();

String sub = name.substring(start, end);
System.out.println("The substring is: %s".formatted(sub));
```

## 🔁 Replace Characters / Substrings
```java
sc.nextLine(); // consume the newline

System.out.print("Enter the character to be replaced: ");
String toReplace = sc.nextLine();

System.out.print("Enter the new character: ");
String newChar = sc.nextLine();

String replacedString = name.replace(toReplace, newChar);
System.out.println("The new string is: %s".formatted(replacedString));
```

## 🔠 Convert to Uppercase
```java
String upperCaseName = name.toUpperCase();
System.out.println("Name in uppercase: %s".formatted(upperCaseName));
```

## 🔡 Convert to Lowercase
```java
String lowerCaseName = name.toLowerCase();
System.out.println("Name in lowercase: %s".formatted(lowerCaseName));
```

## ✨ Trim Leading and Trailing Spaces
```java
System.out.print("Enter a string with leading and trailing spaces: ");
String spacedString = sc.nextLine();

String trimmedString = spacedString.trim();
System.out.println("Trimmed string: '%s'".formatted(trimmedString));
```

## 🔍 Get Character Using charAt()
```java
System.out.print("Enter an index to get the character at that position: ");
int index = sc.nextInt();

char ch = name.charAt(index);
System.out.println("Character at index %d is '%c'".formatted(index, ch));
```

## ⚖️ Compare Two Strings
```java
System.out.print("Enter another name to compare: ");
String anotherName = sc.nextLine();

if (name.equals(anotherName)) {
    System.out.println("Both names are equal.");

} else {
    System.out.println("Names are not equal.");
}
```
