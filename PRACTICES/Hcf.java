package PRACTICES;
import java.util.*;
public class Hcf {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your A:number:");
        int A=sc.nextInt();
        System.out.print("Enter your B:number:");
        int B=sc.nextInt();
        int hcf=1;
        

        // for(int i=1;i<Math.min(A,B);i++){
        //     if(A%i==0 && B%i==0){
        //         hcf=i;
        int min;
        
        if(A>B){
            min=B;
        }
        else{
            min=A;
        }
        for(int i =1;i<=min;i++){
            if(A%i==0 && B%i==0){
                hcf=i;

            
               
            }
        }
        System.out.print("HCF:-:"+hcf);
        sc.close();
    }
    
}
