package array;

public class LargestSum {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        int result = findLargestSum(arr);
        System.out.println("Largest sum of two elements: " + result); // Output: 9
    }

    public static int findLargestSum(int[] arr) {
        if (arr.length < 2) {
            System.out.println("Array must contain at least two elements.");
        }

        int maxSum = Integer.MIN_VALUE;

        // Check all pairs
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int sum = arr[i] + arr[j];
                if (sum > maxSum) {
                    maxSum = sum;
                }
            }
        }

        return maxSum;
    }
}
