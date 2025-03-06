package array;

public class occur {
    public static int findLastOccurrence(int[] arr, int target) {
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == target) {
                return i; 
            }
        }
        return -1; 
    }

    public static int findFirstOccurrence(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    // public static void main(String[] args) {
    //     int[] arr = {1, 2, 2, 4, 2, 5, 3, 6};
    //     int target = 2;
    //     int lastIndex = findLastOccurrence(arr, target);
    //     int firstIndex = findFirstOccurrence(arr, target);
    //     System.out.println( lastIndex);
    //     System.out.println( firstIndex);
    // }

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 4, 2, 5, 3, 6};
        int target = 2;
        for (int i = 0; i<arr.length; i++) {
            if (arr[i] == target) {
                System.out.println(i);
                return;
            }
        }
        System.out.println("-1");
    }
}
