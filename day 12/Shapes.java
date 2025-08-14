import java.util.Scanner;

public class Application {

public static void main(String[] args) {

Scanner sc = new Scanner(System.in);

try {

System.out.println("Enter two numbers:");

int x = sc.nextInt();

int y = sc.nextInt();

int z = x / y;

System.out.println(x + " / " + y + " = " + z);

}

catch (Exception ex) {

System.out.println("--- In catch block ---");

System.out.println(ex.toString());

}

finally {

System.out.println("--- finally block ---");

System.out.println("Application Designed & Developed by");

System.out.println("Team @ Codingal");

sc.close(); // Important to release the Scanner resource

}

System.out.println("--- DONE ---");

}

}