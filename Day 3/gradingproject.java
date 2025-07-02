import java.util.Scanner;

public class gradingproject {
    public static void main(String[] args){

        Scanner scn=new Scanner(System.in);

        System.out.println("Lets Check Your Grade, INPUT:");

        int marks=scn.nextInt();
        if(marks>90){
            System.out.println("o grade");
        }
        else if(marks>80 && marks<=90){
            System.out.println("A Grade");}
            
            else if(marks>70 && marks<=80){
            System.out.println("b Grade");}

            else if(marks>70 && marks<=60){
            System.out.println("c Grade");}
        else{
            System.out.println("F grade ");     
        }
    }
}
