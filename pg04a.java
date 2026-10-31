import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter StringBuffer text: ");
        StringBuffer sb = new StringBuffer(sc.nextLine());

        System.out.println("Original StringBuffer: " + sb);

        // Demonstrate delete()
        System.out.print("Enter delete start index: ");
        int deleteStart = Integer.parseInt(sc.nextLine().trim());
        System.out.print("Enter delete end index: ");
        int deleteEnd = Integer.parseInt(sc.nextLine().trim());
        sb.delete(deleteStart, deleteEnd);
        System.out.println("After delete(" + deleteStart + ", " + deleteEnd + "): " + sb);

        // Demonstrate deleteCharAt()
        System.out.print("Enter deleteCharAt index: ");
        int deleteCharIndex = Integer.parseInt(sc.nextLine().trim());
        sb.deleteCharAt(deleteCharIndex);
        System.out.println("After deleteCharAt(" + deleteCharIndex + "): " + sb);

        // Demonstrate reverse()
        sb.reverse();
        System.out.println("After reverse(): " + sb);

        sc.close();
    }
}