package PRACTICES;
import java.util.*;
public class Lcm {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your A:number:");
        int A=sc.nextInt();
        System.out.print("Enter your B:number:");
        int B=sc.nextInt();
        int hcf=1;
        for(int i=1;i<=Math.min(A,B);i++){
            if(A%i==0 && B%i==0){
                hcf=i;
            }
        }
        System.out.print("LCM:-"+(A*B)/hcf);
        sc.close();
    }
}