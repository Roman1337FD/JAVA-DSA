package PATTERNS;
import java.util.*;
public class Hollow{
public static void main(String[]args){
     Scanner sc = new Scanner(System.in);
     System.out.print("Enter your ROW:");
   int N = sc.nextInt();
    System.out.print("Enter your COLUMN:");
   int M = sc.nextInt();

for(int i=1;i<=N;i++){
         
    for(int j=1;j<=M;j++){
        if(i==1 || j==1 || i==N || j==M){

        System.out.print(" *");
        }
        else{
             System.out.print("  ");

        }
    }
    System.out.println();
     }
      sc.close();



}


}