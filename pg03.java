import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter D1: ");
        String D1 = sc.nextLine();
        System.out.print("Enter D2: ");
        String D2 = sc.nextLine();
        System.out.print("Enter substring start index: ");
        int start = Integer.parseInt(sc.nextLine().trim());
        System.out.print("Enter substring end index: ");
        int end = Integer.parseInt(sc.nextLine().trim());

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
        System.out.println("Substring (" + start + " to " + end + "): " + D1.substring(start, end));
        System.out.println("Concatenation: " + D1.concat(" Let's learn Java."));

        System.out.println("Split by comma:");
        String[] parts = D1.split(",");
        for (String part : parts) {
            System.out.println("-> " + part.trim());
        }

        sc.close();
    }
}