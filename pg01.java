import java.util.*;

// Student class implementing Comparable
class Student implements Comparable<Student> {
    int rollNo;
    String name;

    Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    // Compare by roll number (natural order)
    @Override
    public int compareTo(Student s) {
        return Integer.compare(this.rollNo, s.rollNo);
    }

    @Override
    public String toString() {
        return rollNo + " - " + name;
    }
}

// Comparator to sort by name
class NameComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return s1.name.compareToIgnoreCase(s2.name);
    }
}

// Main class
public class Main {
    public static void main(String[] args) {

        List<Student> list = new ArrayList<>();

        list.add(new Student(103, "Apeksha"));
        list.add(new Student(101, "Rohit"));
        list.add(new Student(104, "Sneha"));
        list.add(new Student(102, "Vivek"));

        // Display original list
        System.out.println("Original List:");
        for (Student s : list) {
            System.out.println(s);
        }

        // Sort by roll number using Comparable
        Collections.sort(list);
        System.out.println("\nSorted by Roll Number:");
        for (Student s : list) {
            System.out.println(s);
        }

        // Sort by name using Comparator
        Collections.sort(list, new NameComparator());
        System.out.println("\nSorted by Name:");
        for (Student s : list) {
            System.out.println(s);
        }

        // Iterate using Iterator
        System.out.println("\nUsing Iterator:");
        Iterator<Student> it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        // Store records in a Map (rollNo -> Student)
        Map<Integer, Student> map = new HashMap<>();
        for (Student s : list) {
            map.put(s.rollNo, s);
        }

        System.out.println("\nMap Contents:");
        for (Map.Entry<Integer, Student> e : map.entrySet()) {
            System.out.println(e.getKey() + " => " + e.getValue());
        }

        // Demonstrate RandomAccess
        if (list instanceof RandomAccess) {
            System.out.println("\nAccess element at index 2: " + list.get(2));
        }
    }
}