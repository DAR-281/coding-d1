
import java.util.Scanner;

public class primefactor {

    public static void main(String[] args) {
        
    Scanner scn = new Scanner(System.in);
  
    int low = sc.nextInt();
    int high = scn.nextInt();

    for (int i = low; i <= high; i++) {
        int count = 0;
        for (int j = 1; j <= i; j++) {
            if (i % j == 0) {
                count++;
            break;
            }
  }
  if (count == 0) {
      System.out.println(i);
    }







}
    
}
