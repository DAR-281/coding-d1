Profile Image

class Counter {

int number = 10; // Each object has its own number

void increment() {

number = number + 1;

}

public static void main(String[] args) {

Counter obj1 = new Counter();

Counter obj2 = new Counter();

Counter obj3 = new Counter();

obj1.increment(); // number = 11 for obj1

obj2.increment(); // number = 11 for obj2

obj3.increment(); // number = 11 for obj3

System.out.println("Object 1: " + obj1.number); // 11

System.out.println("Object 2: " + obj2.number); // 11

System.out.println("Object 3: " + obj3.number); // 11

}

}
































