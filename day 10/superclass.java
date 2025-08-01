// Parent Class

class Parent {

public void sayHello() {

System.out.println("Hello from Parent");

}

}

// Child Class

class Child extends Parent {

@Override

public void sayHello() {

System.out.println("Hello from Child");

}

}

// Main Class

public class override {

public static void main(String[] args) {

Parent p = new Child(); // Polymorphism - parent reference, child object

// Parent p = new Parent(); // Uncomment this to call parent class method

p.sayHello(); // Calls Child's overridden method

}

}
