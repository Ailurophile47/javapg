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
    public static void main(String[] args) {
        LinkedList<Address> ml = new LinkedList<>();

        // Add elements to the linked list
        ml.add(new Address("Arun", "80 Feet Rd", "Banashankari", "Bengaluru", "- 560085"));
        ml.add(new Address("Raj", "Passege Rd", "Jayanagar", "Mysore", "- 542156"));
        ml.add(new Address("Vani", "N G V Main Rd", "JP Nagar", "Bengaluru", "- 560087"));
        ml.add(new Address("Harshitha", "MV Rd", "Banashankari", "Bengaluru", ""));

        // Insert at index 1
        ml.add(1, new Address("Ram", "100 Feet Rd", "RR Nagar", "Bengaluru", "- 560088"));

        // Display original mailing list
        System.out.println("Original mailing list:");
        for (Address element : ml) {
            System.out.println(element + "\n");
        }

        // Remove Vani's address
        ml.removeIf(a -> a.toString().contains("Vani"));

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
    }
}