package PRACTICES;
import java.util.*;
public class Fibonacci{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Entyer your number:");
        int num = sc.nextInt();
        int a=0  , b=1;
        for(int i=0;i<num;i++){
                 System.out.print(a+" ");
           int c=a+b;
           a=b;
           b=c;

            }    
            sc.close();
    
    }
    
}
