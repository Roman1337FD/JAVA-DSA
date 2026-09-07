package ARRAYS;
import java.util.*;
public class OddEven {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int []arr=new int[num];
        for(int i=0; i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int even=0;
        int odd=0;
        for(int i=0; i<arr.length;i++){
        if(arr[i]%2==0){
           even++;
           
        }
        else{
            odd++;

        }
    }
        System.out.println("even = " + even);
        System.out.println("Odd = " + odd);
        sc.close();
    
    }
    
}
