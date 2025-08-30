import java.util.Scanner;

// Parent class

class Calculator {

double num1, num2;

Scanner sc = new Scanner(System.in);

void getInput() {

System.out.print("Enter first number: ");

num1 = sc.nextDouble();

System.out.print("Enter second number: ");

num2 = sc.nextDouble();

}

}

// ➕ Child class for Addition

class Addition extends Calculator {

void compute() {

getInput();

System.out.println("Addition: " + (num1 + num2));

}

}

// ➖ Child class for Subtraction

class Subtraction extends Calculator {

void compute() {

getInput();

System.out.println("Subtraction: " + (num1 - num2));

}

}

// ✖️ Child class for Multiplication

class Multiplication extends Calculator {

void compute() {

getInput();

System.out.println("Multiplication: " + (num1 * num2));

}

}

// ➗ Child class for Division

class Division extends Calculator {

void compute() {

getInput();

if (num2 != 0)

System.out.println("Division: " + (num1 / num2));

else

System.out.println("Error: Division by zero!");

}

}

// Main Class

public class InheritanceCalculatorSimple {

public static void main(String[] args) {

// Just call the required operation directly using object

// Perform Addition

new Addition().compute();

// Perform Subtraction

new Subtraction().compute();

// Perform Multiplication

new Multiplication().compute();

// Perform Division

new Division().compute();

}

}