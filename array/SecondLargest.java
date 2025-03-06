package array;

import java.util.Arrays;

public class SecondLargest {
    public static int findSecondLargest(int[] arr) {
        if (arr.length < 2) {
            System.out.print("Array must have at least two elements");
        }

        Arrays.sort(arr); // Sort the array in ascending order

        // Find the second largest (last different element from the end)
        for (int i = arr.length - 2; i >= 0; i--) {
            if (arr[i] != arr[arr.length - 1]) {
                return arr[i];
            }
        }

        return -1; // If all elements are same
    }

    public static void main(String[] args) {
        int[] arr = {10, 5, 30, 20, 15};
        int[] arr2 = {10, 10, 10, 10, 10};
        System.out.println("Second Largest: " + findSecondLargest(arr)); // Output: 20
        System.out.println("Second Largest: " + findSecondLargest(arr2)); // Output: -1
    }
}
