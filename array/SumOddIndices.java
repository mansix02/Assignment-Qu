package array;

public class SumOddIndices {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};

        int sum = 0;

        // Loop through odd indices
        for (int i = 1; i < arr.length; i += 2) {
            sum += arr[i];
        }

        System.out.println("Sum of elements at odd indices: " + sum);
    }
}
