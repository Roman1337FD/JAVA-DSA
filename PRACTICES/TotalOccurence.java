package PRACTICES;
import java.util.*;
class TotalOccurence {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter length of Array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
            System.out.print("Enter Target Value:");
        int target = sc.nextInt();

        int count = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == target) {
                count++;
            }
        }

        System.out.println("Total occurrence = " + count);
        sc.close();
    }
}