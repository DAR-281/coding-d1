// Interface

interface Vehicle {

double getSpeed(); // km/h

}

// Car class

class Car implements Vehicle {

private double distance; // in km

private double time; // in hours

public Car(double distance, double time) {

this.distance = distance;

this.time = time;

}

@Override

public double getSpeed() {

return distance / time; // speed = distance / time

}

}

// Bicycle class

class Bicycle implements Vehicle {

private double distance; // in km

private double time; // in hours

public Bicycle(double distance, double time) {

this.distance = distance;

this.time = time;

}

@Override

public double getSpeed() {

return distance / time;

}

}

// Airplane class

class Airplane implements Vehicle {

private double distance; // in km

private double time; // in hours

public Airplane(double distance, double time) {

this.distance = distance;

this.time = time;

}

@Override

public double getSpeed() {

return distance / time;

}

}

// SpeedCalculator class

class SpeedCalculator {

public void printSpeeds(Vehicle[] vehicles) {

for (Vehicle v : vehicles) {

System.out.println("Speed: " + v.getSpeed() + " km/h");

}

}

}

// Main class

public class Main {

public static void main(String[] args) {

// Create array of vehicles

Vehicle[] vehicles = {

new Car(120, 2), // 120 km in 2 hours

new Bicycle(15, 0.5), // 15 km in 0.5 hours

new Airplane(1000, 2) // 1000 km in 2 hours

};

// Use SpeedCalculator

SpeedCalculator calculator = new SpeedCalculator();

calculator.printSpeeds(vehicles);

}

}