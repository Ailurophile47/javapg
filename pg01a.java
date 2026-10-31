import java.util.*;

// Student class implementing Comparable
class Student implements Comparable<Student> {
    int rollNo;
    String name;
    int marks;

    Student(int rollNo, String name, int marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }

    @Override
    public int compareTo(Student s) {
        return Integer.compare(this.rollNo, s.rollNo);
    }

    @Override
    public String toString() {
        return "Roll No: " + rollNo + ", Name: " + name + ", Marks: " + marks;
    }
}

// Comparator to sort by name
class NameComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return s1.name.compareToIgnoreCase(s2.name);
    }
}

// Comparator to sort by marks in descending order
class MarksComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return Integer.compare(s2.marks, s1.marks);
    }
}

// Main class
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Student> list = new ArrayList<>();

        System.out.print("Enter number of students: ");
        int numberOfStudents = Integer.parseInt(sc.nextLine().trim());
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.print("Enter roll number: ");
            int rollNo = Integer.parseInt(sc.nextLine().trim());
            System.out.print("Enter name: ");
            String name = sc.nextLine();
            System.out.print("Enter marks: ");
            int marks = Integer.parseInt(sc.nextLine().trim());
            list.add(new Student(rollNo, name, marks));
        }

        System.out.println("Original Student Records:");
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

        // Sort by marks in descending order
        Collections.sort(list, new MarksComparator());
        System.out.println("\nSorted by Marks (Descending):");
        System.out.println("Roll No\tName\tMarks");

        for (Student s : list) {
            System.out.println(s.rollNo + "\t" + s.name + "\t" + s.marks);
        }

        // Iterate using Iterator
        System.out.println("\nUsing Iterator:");
        Iterator<Student> it = list.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }

        // Store records in a Map
        Map<Integer, Student> map = new HashMap<>();

        for (Student s : list) {
            map.put(s.rollNo, s);
        }

        System.out.println("\nMap Contents:");
        for (Map.Entry<Integer, Student> e : map.entrySet()) {
            System.out.println(e.getKey() + " => " + e.getValue());
        }

        // Demonstrate RandomAccess
        if (list instanceof RandomAccess && list.size() > 2) {
            System.out.println("\nAccess element at index 2: " + list.get(2));
        }

        sc.close();
    }
}