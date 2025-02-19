package Condition;

import java.util.Scanner;

public class GradingSys {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three subjects marks :" );
        int m = sc.nextInt();
        int p = sc.nextInt();
        int c = sc.nextInt();
        int avg = (m+p+c)/3;
        System.out.println("avg :"+ avg);
        sc.close();
    }
    
}
