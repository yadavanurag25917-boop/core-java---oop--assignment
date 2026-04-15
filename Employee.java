/// constructer + static keyword
public class Employee {
    int empId;
    String empName;
    double salary;
    static String companyName = "ABC Training Institute";

    public Employee(int empId, String empName, double salary) {
        this.empId = empId;
        this.empName = empName;
        this.salary = salary;
    }
       public void showDetails() {
        System.out.println("Company: " + companyName);
        System.out.println("Employee ID: " + empId);
        System.out.println("Name: " + empName);
        System.out.println("Salary: " + salary);
    }
}
