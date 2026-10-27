import java.util.*;

class Employee {
    private int id;
    private String name;
    private String department;
    private String designation;

    Employee(int id, String name, String department, String designation) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.designation = designation;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Employee ID: " + id +
               "\nName: " + name +
               "\nDepartment: " + department +
               "\nDesignation: " + designation;
    }
}

public class Main {
    public static void main(String[] args) {
        LinkedList<Employee> employees = new LinkedList<>();

        employees.add(new Employee(101, "Arun", "IT", "Developer"));
        employees.add(new Employee(102, "Raj", "HR", "Manager"));
        employees.add(new Employee(103, "Vani", "Finance", "Accountant"));
        employees.add(new Employee(104, "Harshitha", "IT", "Tester"));

        // Display all employees
        System.out.println("Employee List:");
        for (Employee e : employees) {
            System.out.println(e + "\n");
        }

        // Search employee using employee ID
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Employee ID to search: ");
        int searchId = sc.nextInt();

        boolean found = false;

        for (Employee e : employees) {
            if (e.getId() == searchId) {
                System.out.println("\nEmployee Details:");
                System.out.println(e);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Employee not found");
        }

        sc.close();
    }
}