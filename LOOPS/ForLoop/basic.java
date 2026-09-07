/*  for (initalization;condition;updation){
statements}
*/



package LOOPS.ForLoop;
import java.util.*;
public class basic {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter digit");
        int digit = sc.nextInt();

        // for(int i=1;i<=digit;i++){
        //     System.out.println("SADA SHIV");
        // }
        // ***OUTPUT = SADA SHIV   ***

        for(int i=0;i<=digit;i++){
            System.out.println(i);
        }
        // **OUTPUT= COUNTING  NUMBERS**
sc.close();

    }
    
}
