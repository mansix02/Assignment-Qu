package Condition;

import java.util.Scanner;

public class ShopDis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Total Cost :");
        int a = sc.nextInt();
        System.out.print("Enter number of item :");
        int i = sc.nextInt();
        if(a>100||i>=5){
            int d= (a*10)/100;
            System.out.println("Discount is :"+ d);
        }else if( a>=50 || a<=100){
            int d= (a*5)/100;
            System.out.println("Discount is :"+d);
        }else{
            System.out.println("NO Discount");
        }
        sc.close();
    }
}
