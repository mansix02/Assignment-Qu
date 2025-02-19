package Loop;

import java.util.Scanner;

public class FebonacciSeries {

    public static void febo(int n){
        int firstTerm = 0;
        int secondTerm = 1;
         
        System.out.println("Fibonacci Series up to " + n + " terms:");
        
        for (int i = 0; i < n; i++) {
            System.out.print(firstTerm + " ");
            
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number of terms: ");
        int n = sc.nextInt();
        
        febo(n);

        sc.close();  
    } 
}
