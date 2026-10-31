import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Create a StringBuffer object
        System.out.print("Enter initial StringBuffer text: ");
        StringBuffer sb = new StringBuffer(sc.nextLine());

        // Step 2: Display initial content and capacity
        System.out.println("Original StringBuffer: " + sb);
        System.out.println("Length: " + sb.length());
        System.out.println("Capacity: " + sb.capacity());

        // Step 3: Append text
        System.out.print("Enter append text: ");
        sb.append(sc.nextLine());
        System.out.println("\nAfter append: " + sb);

        // Step 4: Insert text
        System.out.print("Enter insert index: ");
        int insertIndex = Integer.parseInt(sc.nextLine().trim());
        System.out.print("Enter insert text: ");
        sb.insert(insertIndex, sc.nextLine());
        System.out.println("After insert: " + sb);

        // Step 5: Replace text
        System.out.print("Enter replace start index: ");
        int replaceStart = Integer.parseInt(sc.nextLine().trim());
        System.out.print("Enter replace end index: ");
        int replaceEnd = Integer.parseInt(sc.nextLine().trim());
        System.out.print("Enter replace text: ");
        sb.replace(replaceStart, replaceEnd, sc.nextLine());
        System.out.println("After replace: " + sb);

        // Step 6: Delete a portion of text
        System.out.print("Enter delete start index: ");
        int deleteStart = Integer.parseInt(sc.nextLine().trim());
        System.out.print("Enter delete end index: ");
        int deleteEnd = Integer.parseInt(sc.nextLine().trim());
        sb.delete(deleteStart, deleteEnd);
        System.out.println("After delete: " + sb);

        // Step 7: Reverse the string
        sb.reverse();
        System.out.println("After reverse: " + sb);

        // Step 8: Reverse again to restore the original order
        sb.reverse();

        // Step 9: Set character at a position
        System.out.print("Enter setCharAt index: ");
        int setCharIndex = Integer.parseInt(sc.nextLine().trim());
        System.out.print("Enter character: ");
        char character = sc.nextLine().charAt(0);
        sb.setCharAt(setCharIndex, character);
        System.out.println("After setCharAt: " + sb);

        // Step 10: Ensure capacity
        sb.ensureCapacity(100);
        System.out.println("Capacity after ensureCapacity(100): " + sb.capacity());

        // Step 11: Trim capacity to the current length
        sb.trimToSize();
        System.out.println("Capacity after trimToSize(): " + sb.capacity());

        // Step 12: Delete a single character
        System.out.print("Enter deleteCharAt index: ");
        int deleteCharIndex = Integer.parseInt(sc.nextLine().trim());
        sb.deleteCharAt(deleteCharIndex);
        System.out.println("After deleteCharAt(" + deleteCharIndex + "): " + sb);

        sc.close();
    }
}