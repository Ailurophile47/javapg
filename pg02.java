import java.util.*;

class Address {
    private String name;
    private String street;
    private String city;
    private String state;
    private String code;

    Address(String n, String s, String c, String st, String cd) {
        name = n;
        street = s;
        city = c;
        state = st;
        code = cd;
    }

    @Override
    public String toString() {
        return name + "\n" + street + "\n" + city + " " + state + " " + code;
    }
}

public class Main {
    static Address readAddress(Scanner sc) {
        System.out.print("Enter name: ");
        String name = sc.nextLine();
        System.out.print("Enter street: ");
        String street = sc.nextLine();
        System.out.print("Enter city: ");
        String city = sc.nextLine();
        System.out.print("Enter state: ");
        String state = sc.nextLine();
        System.out.print("Enter code: ");
        String code = sc.nextLine();
        return new Address(name, street, city, state, code);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Address> ml = new LinkedList<>();

        // Add elements to the linked list
        System.out.print("Enter number of addresses: ");
        int numberOfAddresses = Integer.parseInt(sc.nextLine().trim());
        for (int i = 0; i < numberOfAddresses; i++) {
            ml.add(readAddress(sc));
        }

        // Insert at index 1
        System.out.println("Enter address to insert at index 1:");
        ml.add(Math.min(1, ml.size()), readAddress(sc));

        // Display original mailing list
        System.out.println("Original mailing list:");
        for (Address element : ml) {
            System.out.println(element + "\n");
        }

        // Remove Vani's address
        System.out.print("Enter name whose address should be removed: ");
        String nameToRemove = sc.nextLine();
        ml.removeIf(a -> a.toString().contains(nameToRemove));

        // Display list after deletion
        System.out.println("Mailing list after deletions:");
        for (Address element : ml) {
            System.out.println(element + "\n");
        }

        // Remove first and last elements
        if (!ml.isEmpty()) {
            ml.removeFirst();
        }
        if (!ml.isEmpty()) {
            ml.removeLast();
        }

        // Display final mailing list
        System.out.println("Mailing list after removing first and last:");
        for (Address element : ml) {
            System.out.println(element + "\n");
        }

        sc.close();
    }
}