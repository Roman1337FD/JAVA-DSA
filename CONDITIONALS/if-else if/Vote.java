// if,else,else if,switch and break 
import java.util.*;
public class Vote{
    public static void main (String[]args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter your Age.");
        int Age = sc.nextInt();
        if(Age>=18){
            System.out.println("Candidate is eligible for Vote.");
        }
        else{
            System.out.println("Candidate is not eligible for Vote.");
        }
        sc.close();
    }

}