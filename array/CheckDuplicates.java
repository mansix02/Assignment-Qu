package array;

public class CheckDuplicates {

    public static boolean hasDuplicate(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) { // Compare with the next elements
                if (arr[i] == arr[j]) {
                    return true; // Duplicate found
                }
            }
        }
        return false; // No duplicates
    }
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5, 1};
        int[] arr2 = {1, 2, 3, 4, 5};

        System.out.println("Contains duplicate (arr1): " + hasDuplicate(arr1));
        System.out.println("Contains duplicate (arr2): " + hasDuplicate(arr2));
    }

}
