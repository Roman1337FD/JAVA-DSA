import java.util.*;

public class Greater {
    public static void main(String[]args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter your A ");
        int A = sc.nextInt();
          System.out.println("Enter your B ");
        int B = sc.nextInt();

        if(A==B){
            System.out.println("A is Equal to B.");
        }
        else if (A > B){
            System.out.println("A is greater.");
        }
        else if (A < B){
            System.out.println("B is Greater.");
        }
     else{
        System.out.println("not define.");
     }   

     sc.close();
    }
    
}
