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
        Scanner sc = new Scanner(System.in);
        LinkedList<Employee> employees = new LinkedList<>();

        System.out.print("Enter number of employees: ");
        int numberOfEmployees = Integer.parseInt(sc.nextLine().trim());
        for (int i = 0; i < numberOfEmployees; i++) {
            System.out.print("Enter employee ID: ");
            int id = Integer.parseInt(sc.nextLine().trim());
            System.out.print("Enter name: ");
            String name = sc.nextLine();
            System.out.print("Enter department: ");
            String department = sc.nextLine();
            System.out.print("Enter designation: ");
            String designation = sc.nextLine();
            employees.add(new Employee(id, name, department, designation));
        }

        // Display all employees
        System.out.println("Employee List:");
        for (Employee e : employees) {
            System.out.println(e + "\n");
        }

        // Search employee using employee ID
        System.out.print("Enter Employee ID to search: ");
        int searchId = Integer.parseInt(sc.nextLine().trim());

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