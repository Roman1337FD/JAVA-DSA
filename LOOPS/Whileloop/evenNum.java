package LOOPS.Whileloop;
import java.util.*;
public class evenNum {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int i=0;
        
        while(i<num){
            if(i % 2==0){               
                System.out.println(i);
            }
            i++;

        }
        sc.close();
    }
    
}
