/*  while(conditions){
do something}
 */


package LOOPS.Whileloop;
import java.util.*;

public class basic {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num :");
        int num = sc.nextInt();

        int i=1;
        while(i<=10){
            System.out.println(i*num);
            i++;
        }
        sc.close();
    }
    
}
