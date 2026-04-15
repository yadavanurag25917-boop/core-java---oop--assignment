// Student class to store student information 
public class Student {
    int rollNo;
    String name;
    double marks;

    public void displayDetails() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
    }
        public void showNameFormats() {
            System.out.println("Original Name:" + name);
           System.out.println("Uppercase: " + name.toUpperCase());
            System.out.println("lowercase: " + name.toLowerCase());
            System.out.println("Name length:" + name.length());
    }
}
