package array;

public class FirstNonRepeating {

    public static int findFirstNonRepeating(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            boolean isUnique = true;

            for (int j = 0; j < arr.length; j++) {
                if (i != j && arr[i] == arr[j]) {
                    isUnique = false; // If found duplicate, set flag to false
                    break; // No need to check further
                }
            }

            if (isUnique) {
                return arr[i]; // First non-repeating element found
            }
        }

        return -1; // If no unique element is found
    }

    public static void main(String[] args) {
        int[] arr1 = {4, 5, 6, 4, 5, 7};
        int[] arr2 = {4, 4, 5, 5};

        System.out.println("First non-repeating element (arr1): " + findFirstNonRepeating(arr1)); // Output: 6
        System.out.println("First non-repeating element (arr2): " + findFirstNonRepeating(arr2)); // Output: -1
    }
}
