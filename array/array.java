package array;

import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[]= new int [4];
        arr[0] = sc.nextInt();
        arr[1] = sc.nextInt();
        arr[2] = sc.nextInt();
        arr[3] = sc.nextInt();
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
        sc.close();
    }
}
