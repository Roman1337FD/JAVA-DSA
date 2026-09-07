package LOOPS.Whileloop;

import java.util.Scanner;

public class StudentMarks {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int choice;

        while (true) {
            System.out.println("\nEnter 1 to enter marks");
            System.out.println("Enter 0 to Exit");
            choice = sc.nextInt();

            if (choice == 0) {
                System.out.println("Program Ended.");
                break;
            }

            System.out.print("Enter Marks (0-100): ");
            int marks = sc.nextInt();

            if (marks >= 90) {
                System.out.println("This is Good");
            } else if (marks >= 60) {
                System.out.println("This is also Good");
            } else if (marks >= 0) {
                System.out.println("This is Good as well");
            } else {
                System.out.println("Invalid Marks");
            }
        }

        sc.close();
    }
}
