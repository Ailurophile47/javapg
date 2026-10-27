import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String D1 = "Hello, Hi!";
        String D2 = "hello, hi!";

        System.out.println("Original String: " + D1);
        System.out.println("Character at index 1: " + D1.charAt(1));
        System.out.println("Unicode at index 1: " + D1.codePointAt(1));

        System.out.println("\n--- String Comparison ---");
        System.out.println("D1.equals(D2): " + D1.equals(D2));
        System.out.println("D1.equalsIgnoreCase(D2): " + D1.equalsIgnoreCase(D2));
        System.out.println("D1.compareTo(D2): " + D1.compareTo(D2));
        System.out.println("D1.compareToIgnoreCase(D2): " + D1.compareToIgnoreCase(D2));

        System.out.println("\n--- String Search ---");
        System.out.println("Index of 'hi': " + D1.indexOf("hi"));
        System.out.println("Last index of 'i': " + D1.lastIndexOf('i'));
        System.out.println("Starts with 'Hello': " + D1.startsWith("Hello"));
        System.out.println("Ends with '!': " + D1.endsWith("!"));
        System.out.println("Contains 'o': " + D1.contains("o"));

        System.out.println("\n--- String Modification ---");
        System.out.println("Lowercase: " + D1.toLowerCase());
        System.out.println("Uppercase: " + D1.toUpperCase());
        System.out.println("Replace 'Hi' with 'Java': " + D1.replace("Hi", "Java"));
        System.out.println("Substring (7 to 9): " + D1.substring(7, 9));
        System.out.println("Concatenation: " + D1.concat(" Let's learn Java."));

        System.out.println("Split by comma:");
        String[] parts = D1.split(",");
        for (String part : parts) {
            System.out.println("-> " + part.trim());
        }

        // Accept a sentence from the user
        System.out.println("\n--- User String Modification ---");
        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();

        // Remove leading and trailing spaces
        sentence = sentence.trim();
        System.out.println("After removing leading and trailing spaces: " + sentence);

        // Convert to uppercase
        System.out.println("Uppercase: " + sentence.toUpperCase());

        // Convert to lowercase
        System.out.println("Lowercase: " + sentence.toLowerCase());

        // Replace a specified word
        System.out.print("Enter the word to replace: ");
        String oldWord = sc.nextLine();

        System.out.print("Enter the new word: ");
        String newWord = sc.nextLine();

        sentence = sentence.replace(oldWord, newWord);
        System.out.println("After replacement: " + sentence);

        sc.close();
    }
}