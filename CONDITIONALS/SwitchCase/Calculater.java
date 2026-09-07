package CONDITIONALS.SwitchCase;

import java.util.Scanner;

public class Calculater {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your num. A");
        float A = sc.nextFloat();
        System.out.println("Enter your num. B");
        float B = sc.nextFloat();
        System.out.println("Enter your choice.");
        System.out.println("1: Addition.");
        System.out.println("2: Subtration.");
        System.out.println("3: Multiplication.");
        System.out.println("4:division.");

        int choice =sc.nextInt();


        switch(choice){
            case 1 : System.out.println( A+B);
            break;
            case 2 : System.out.println( A-B);
            break;
            case 3 : System.out.println( A*B);
            break;
            case 4 : System.out.println( A/B);
            break;
            default : System.out.println("INVAILD");

        }
        sc.close();

    }
}
