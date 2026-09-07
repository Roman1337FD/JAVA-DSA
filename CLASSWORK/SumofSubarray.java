package CLASSWORK;
import java.util.Scanner;
public class SumofSubarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter k: ");
        int k = sc.nextInt();
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }

        System.out.print(sum + ",");
        for (int i = k; i < n; i++) {
            sum = sum + arr[i] - arr[i - k];
            System.out.print(sum + ",");
        }
        sc.close();
    
    }
}