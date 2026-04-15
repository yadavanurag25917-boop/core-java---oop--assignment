// collage student extends student - inheritence
public class CollegeStudent extends Student {
    
    String collegeName;
    String course;

    public void showCollegeInfo() {
        displayDetails();
        System.out.println("College Name: " + collegeName);
        System.out.println("Course: " + course);
    }
}
