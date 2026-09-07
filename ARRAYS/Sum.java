package ARRAYS;
import java.util.*;
public class Sum {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int nums=sc.nextInt();
        int arr[]= new int[nums];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();

        }
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
        }
        System.out.print(sum);
        sc.close();
        
    }
    
}
