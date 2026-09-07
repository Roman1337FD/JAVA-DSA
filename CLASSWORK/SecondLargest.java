package CLASSWORK;

public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = {50, 30, 70, 28, 65};
        int largest = arr[0];
        int secondLargest = arr[0];
        int smallest = arr[0];
        int secondSmallest = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            }
            else if (arr[i] > secondLargest) {
                secondLargest = arr[i];
            }
            if (arr[i] < smallest) {
                secondSmallest = smallest;
                smallest = arr[i];
            }
            else if (arr[i] < secondSmallest) {
                secondSmallest = arr[i];
            }
        }

        System.out.println("Second Largest: " + secondLargest);
        System.out.println("Second Smallest: " + secondSmallest);
    }
}