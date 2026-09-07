package  LOOPS.ForLoop;
import java.util.*;

public class Prime {
    public static void main (String[]agrs){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num=sc.nextInt();

        if(num<=1){
            System.out.println("No. is not prime");
        }
        else{
            int i;
            for( i=2;i<num;i++){
            if(num%i==0){
                System.out.println("Not a prime Number.");
                break;
            }
            }
        if (num==i){
            System.out.println("Prime Number.");
    }
}
sc.close();
    
}
}

