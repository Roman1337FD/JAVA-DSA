package CLASSWORK;
import java.util.*;
public class InsertionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Size: ");
        int num = sc.nextInt();
        int arr[] = new int[num];
        System.out.println("Enter array elements:");
        for (int i = 0; i < num; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 1; i < num; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
        System.out.println("Sorted Array:");
        for (int i = 0; i < num; i++) {
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}