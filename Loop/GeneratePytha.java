package Loop;

import java.util.Scanner;

public class GeneratePytha {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the limit: ");
        int limit = scanner.nextInt();
        
        scanner.close();
        
        System.out.println("Pythagorean Triples up to " + limit);
        
        for (int a = 1; a <= limit; a++) {
            for (int b = a + 1; b <= limit; b++) {
                for (int c = b + 1; c <= limit; c++) {
                    if (a * a + b * b == c * c) {
                        System.out.println("(" + a + ", " + b + ", " + c + ")");
                    }
                }
            }
        }
    }
    
}
