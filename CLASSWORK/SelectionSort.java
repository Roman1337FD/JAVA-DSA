package CLASSWORK;
import java.util.*;
public class SelectionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Size: ");
        int num = sc.nextInt();
        int arr[] = new int[num];
        System.out.println("Enter array elements:");
        for (int i = 0; i < num; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < num - 1; i++) {
            int min = i;
            for (int j = i + 1; j < num; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
        System.out.println("Sorted Array:");
        for (int i = 0; i < num; i++) {
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}