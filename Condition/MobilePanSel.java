package Condition;

import java.util.Scanner;

public class MobilePanSel {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter minutes :");
        int m = sc.nextInt();
        System.out.print("Enter sms numbers :");
        int s = sc.nextInt();
        if(s<=100 || m<=100){
            System.out.println("plan A : $25");
        }else if(s<=200 || m<=200){
            System.out.println("plan B : $40");
        }else{
            System.out.println("plan C : $60");
        }
        sc.close();
    }
    
}
