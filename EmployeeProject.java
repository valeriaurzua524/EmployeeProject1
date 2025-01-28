public class EmployeeProject {
    private String name;
    private String employeeNumber;
    private String hireDate;

    
    public EmployeeProject(String name, String employeeNumber, String hireDate) {
        this.name = name;
        this.employeeNumber = employeeNumber;
        this.hireDate = hireDate;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setEmployeeNumber(String employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    public void setHireDate(String hireDate) {
        this.hireDate = hireDate;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getEmployeeNumber() {
        return employeeNumber;
    }

    public String getHireDate() {
        return hireDate;
    }

    // Main method for testing
    public static void main(String[] args) {
        // Create an Employee object
        EmployeeProject employee = new EmployeeProject("John Doe", "123-A", "01/15/2022");

        // Display initial employee information
        System.out.println("Initial Employee Information:");
        System.out.println("Name: " + employee.getName());
        System.out.println("Employee Number: " + employee.getEmployeeNumber());
        System.out.println("Hire Date: " + employee.getHireDate());

        // Modify the employee's information
        employee.setName("Jane Smith");
        employee.setEmployeeNumber("456-B");
        employee.setHireDate("05/20/2023");

        // Display updated employee information
        System.out.println("\nUpdated Employee Information:");
        System.out.println("Name: " + employee.getName());
        System.out.println("Employee Number: " + employee.getEmployeeNumber());
        System.out.println("Hire Date: " + employee.getHireDate());
    }
}
