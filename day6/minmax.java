import java.util.Scanner;

class minmax

{

public static void main(String[] args) {

Scanner scn = new Scanner(System.in);

int number;

int max = Integer.MIN_VALUE; // Smallest possible integer

int min = Integer.MAX_VALUE; // Largest possible integer

char choice;

do {

System.out.print("Enter the number ");

number = scn.nextInt();

if (number > max) {

max = number; // update max

}

if (number < min) {

min = number; // update min

}

System.out.print("Do you want to continue y/n? ");

choice = scn.next().charAt(0); // Read only the first character

} while (choice == 'y' || choice == 'Y'); // yes

System.out.println("Largest number: " + max);

System.out.println("Smallest number: " + min);

}

}

