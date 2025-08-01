 class student {
    int id;
    String name;
    int age;

    //Constructer

    student(){

        System.out.println("Default constructor called");
    }

    //2 parameter constructor

    Student(int id, String name) {
        this.id = id;
        this.name = name;

    }

      Student(int id, String name) {
        this.id = id;
        this.name = name;

        this.college = college;

    }

    void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Age: " + college);
    }

public class overload {
    public static void main(String[] args) {
        student s1 = new student(); 
        student s2 = new student("sohum "); 
        student s3 = new student("cody"); 

s1.display(); // Displaying default constructor values
        s2.display(); // Displaying values from 2-parameter constructor
        s3.display(); // Displaying values from 2-parameter constructor

    }

}
















