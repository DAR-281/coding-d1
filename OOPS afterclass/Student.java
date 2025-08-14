public class Student {
    String name;
    int grade;

    //constructor
    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }
    
    public void displayinfo() {
        System.out.println("Name: " + name);
        System.out.println("Grade: " + grade);
    }
}
