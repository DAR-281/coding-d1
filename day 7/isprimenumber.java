import java.util.Scanner;

public class isprimenumber {
public static void main(String[] args) {
    
    Scanner scn = new Scanner(System.in);
for (int i = 1; i<= t; i++) {
    int n = scn.nextInt();
    int count = 0;

    for (int div = 2; div * div <=n; div++){
        if (n % div ==0) {
            count++;
            break;
        }
    }

    if (count == 0) {
        System.out.println("prime");
    }else {
        System.out.println("Not prime");
    }
    }
}
}
