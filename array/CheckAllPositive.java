package array;

public class CheckAllPositive {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {-1, 2, 3, 4, 5};

        System.out.println("Array 1 all positive: " + isAllPositive(arr1)); // Output: true
        System.out.println("Array 2 all positive: " + isAllPositive(arr2)); // Output: false
    }

    public static boolean isAllPositive(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= 0) {
                return false; // If any number is not positive, return false
            }
        }
        return true; // If all numbers are positive, return true
    }
}

