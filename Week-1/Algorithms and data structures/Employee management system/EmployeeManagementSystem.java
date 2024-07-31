package EMS;

public class EmployeeManagementSystem {

    private Employee[] employees;
    private int size;

    public EmployeeManagementSystem(int capacity) {
        employees = new Employee[capacity];
        size = 0;
    }

    // Add an employee
    public boolean addEmployee(Employee employee) {
        if (size < employees.length) {
            employees[size] = employee;
            size++;
            return true;
        } else {
            System.out.println("Array is full, cannot add more employees.");
            return false;
        }
    }

    // Search an employee by employeeId
    public Employee searchEmployee(int employeeId) {
        for (int i = 0; i < size; i++) {
            if (employees[i].employeeId == employeeId) {
                return employees[i];
            }
        }
        return null;
    }

    // Traverse and print all employees
    public void traverseEmployees() {
        for (int i = 0; i < size; i++) {
            System.out.println(employees[i]);
        }
    }

    // Delete an employee by employeeId
    public boolean deleteEmployee(int employeeId) {
        for (int i = 0; i < size; i++) {
            if (employees[i].employeeId == employeeId) {
                // Shift elements to the left
                for (int j = i; j < size - 1; j++) {
                    employees[j] = employees[j + 1];
                }
                employees[size - 1] = null; // Remove the last element
                size--;
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        EmployeeManagementSystem ems = new EmployeeManagementSystem(5);

        ems.addEmployee(new Employee(1, "Alice", "Manager", 80000));
        ems.addEmployee(new Employee(2, "Bob", "Developer", 60000));
        ems.addEmployee(new Employee(3, "Charlie", "Designer", 55000));

        System.out.println("All Employees:");
        ems.traverseEmployees();

        System.out.println("\nSearching for employee with ID 2:");
        Employee emp = ems.searchEmployee(2);
        System.out.println(emp != null ? emp : "Employee not found");

        System.out.println("\nDeleting employee with ID 2:");
        boolean isDeleted = ems.deleteEmployee(2);
        System.out.println(isDeleted ? "Employee deleted" : "Employee not found");

        System.out.println("\nAll Employees after deletion:");
        ems.traverseEmployees();
    }
}
