package Condition;

import java.util.Scanner;

public class Shipping {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter weight :");
        int w = sc.nextInt();
        System.out.print("Enter Distance :");
        int d = sc.nextInt();
        if(w<=10 || d<=100){
            System.out.println("Cost is $5");
        }else if((w<=10 && w<=20)||(d>100 && d<500)){
            System.out.println("Cost is $10");
        }else{
            System.out.println("Cost is $20");
        }
        sc.close();
    }
    
}
