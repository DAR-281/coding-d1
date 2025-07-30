class Parent {
    int age;
    String name;

    void user(String name){
        System.out.println("Name: " + name);
    }
    
}


class child extends Parent {
    void old(int age) {
        System.out.println("Age: " + age);
    }
public class Student{
public static void main(String[] args) {
        Son s =  new Son();
        s.user("Sohum");
        s.old(16);
    }

}