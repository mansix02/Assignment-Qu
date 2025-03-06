package array;

public class PalindromeArray {
    public static boolean isPalindrome(int[] arr) {
        int left = 0, right = arr.length - 1;

        while (left < right) {
            if (arr[left] != arr[right]) {
                return false; // If any mismatch is found, it's not a palindrome
            }
            left++;
            right--;
        }
        return true; // If all elements matched, it's a palindrome
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 2, 1};
        int[] arr2 = {1, 2, 3, 4};

        System.out.println(isPalindrome(arr1)); // Output: true
        System.out.println(isPalindrome(arr2)); // Output: false
    }
}
