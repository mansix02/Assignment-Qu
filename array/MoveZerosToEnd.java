package array;

import java.util.Arrays;

public class MoveZerosToEnd {
    public static void moveZerosToEnd(int[] arr) {
        int nonZeroIndex = 0; // Pointer for placing non-zero elements

        // Move non-zero elements to the front
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[nonZeroIndex];
                arr[nonZeroIndex] = temp;
                nonZeroIndex++;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 0, 3, 0, 4};
        moveZerosToEnd(arr);
        System.out.println(Arrays.toString(arr)); // Output: [1, 2, 3, 4, 0, 0, 0]
    }
}

