package array;

public class MissingNumberFinder {
    public static int findMissingNumber(int[] arr, int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        
        // for (int num : arr) {
        //     sum -= num;
        // }

        for (int i =0; i<arr.length; i++) {
            sum -= arr[i];
        }
        
        return sum;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5};
        int n = 5;
        int missingNumber = findMissingNumber(arr, n);
        System.out.println("Missing number: " + missingNumber);
    }
}


