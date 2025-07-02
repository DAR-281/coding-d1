import java.util.Scanner; // Import Scanner to read user input

public class hello {

public static void main(String[] args) {

Scanner scn = new Scanner(System.in); // Create Scanner object

// Read a string

String str = scn.nextLine();

System.out.println("The string is: " + str);

// Read an integer

int number = scn.nextInt();

System.out.println("The number is: " + number);

// Read a float

float decimal = scn.nextFloat();

System.out.println("The float number is: " + decimal);

}

}
