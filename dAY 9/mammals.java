// This activity is mainly to explain Hierarchical Inheritance

// Parent class
class Mammals {
    void mam() {
        System.out.println("Inside Mammals Class");
    }
}

// First Child class
class Lion extends Mammals {
    void roar() {
        System.out.println("Inside Lion Class");
    }
}

// Second Child class
class Human extends Mammals {
    void hum() {
        System.out.println("Inside Human Class");
    }
}

// Main class
class mamals {
    public static void main(String[] args) {

        // Creating object of Lion class
        Lion lionObj = new Lion();
        System.out.println("Lion Object Output:");
        lionObj.roar(); // Calls method in Lion class
        lionObj.mam(); // Inherited from Mammals class

        System.out.println();

        // Creating object of Human class
        Human humanObj = new Human();
        System.out.println("Human Object Output:");
        humanObj.hum(); // Calls method in Human class
        humanObj.mam(); // Inherited from Mammals class
    }
}