(500.0);
        billing.calculateBill(500.0, 300.0);
        billing.calculateBill(500.0, 300.0, 200.0);
// Main class - run all user stories
public class Main {

    public static void main(String[] args) {

        System.out.println("===== Student Billing System =====");

        Student s1 = new Student();
        s1.rollNo = 101;
        s1.name = "Rahul Sharma";
        s1.marks = 85.5;
        s1.displayDetails();

        s1.showNameFormats();

        double[] marksArray = {75.0, 88.5, 60.0, 92.0, 55.5};
        for (int i = 0; i < marksArray.length; i++) {
            System.out.println("Student " + (i+1) + " Marks: " + marksArray[i]);
        }
        ProductBilling billing = new ProductBilling();
        billing.calculateBill
        // US-05 and US-06
        Employee emp1 = new Employee(1, "Suresh Kumar", 45000.0);
        Employee emp2 = new Employee(2, "Meena Joshi", 52000.0);
        emp1.showDetails();
        emp2.showDetails();

        Product p1 = new Product();
        p1.setProductId(201);
        p1.setProductName("Java Book");
        p1.setPrice(450.0);
        p1.showProduct();

        CollegeStudent cs1 = new CollegeStudent();
        cs1.rollNo = 301;
        cs1.name = "Priya Singh";
        cs1.marks = 91.0;
        cs1.collegeName = "Delhi Technical College";
        cs1.course = "B.Tech CSE";
        cs1.showCollegeInfo();

        System.out.println("===== Program End =====");
    }
}
