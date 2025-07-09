import java.util.Scanner;

public class sum {

public static void main(String[] args) {

Scanner scn = new Scanner(System.in); // Create scanner object for input

int n = scn.nextInt(); // Read an integer input from user

int sum = 0; // Initialize sum to 0

for (int i = 1; i <= n; i++) { // Loop from 1 to n

sum += i; // Add i to sum in each iteration

}

System.out.println("Sum till " + n + " is " + sum + ".");

}

}

