abstract class Objects {
    abstract void showShape(); // Abstract method

    void display() {
        System.out.println("I'm from abstract class");
    }
}

class Sphere extends Objects {
    void showShape() {
        System.out.println("Object type is Sphere.");
    }
}

class Cuboid extends Objects {
    void showShape() {
        System.out.println("Object type is Cuboid.");
    }
}

public class Shapes {

public static void main (String[] args) {

Objects obj;

obj = new Sphere();
obj.showShape();
obj = new Cuboid();


obj.showShape();
obj.display();

  }
}
