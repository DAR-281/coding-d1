import java.util.Scanner;

class Bank {
    String name;
    double balance;
    
    Bank(String n, double b){
        name = n;
        balance = b;
    
}

void deposit(double amt){
    balance += amt;
}

void withdraw(double amt){
    if (amt <= balance)
        balance -= amt;
    else
    System.out.println("Insufficient Funds");
    
}


void showBalance() {
    System.out.println("Balance $" + balance);
    

}
}


public class Amex {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter User:");
String n = sc.nextLine();
System.out.print("Enter inital Balance");
double b = sc.nextDouble();
Bank acc = new Bank(n, b);

int ch;
do {
    System.out.println("\n1.Deposit 2.Withdrawl 3. Check Balance 4. Exit");
    ch = sc.nextInt();
    switch (ch) {
        case 1:
            System.out.print("Amount");
            acc.deposit(sc.nextDouble());
            break;
            
            case 2:
            System.out.print("Amount");
            acc.withdraw(sc.nextDouble());
            break;
            
            case 3:
            acc.showBalance();
            break;
    }

}  while(ch != 4);
System.out.println("Thank you for banking with us!");
sc.close();
}
}