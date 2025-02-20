package String;

import java.util.Scanner;

public class ReverseStr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        scanner.close();
        
        String reversed = new StringBuilder(input).reverse().toString();
        
        System.out.println("The reversed string is: " + reversed);
    }
}
