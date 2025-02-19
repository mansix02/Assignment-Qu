package Condition;

import java.util.Scanner;

public class LibraryFess {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of days overdue: ");
        int daysOverdue = scanner.nextInt();
        scanner.nextLine(); 
        
        System.out.print("Enter the type of book (regular, fiction, reference): ");
        String bookType = scanner.nextLine();
        
        double lateFee = 0;
        
        if (bookType.equals("regular")) {
            lateFee = daysOverdue * 0.50;
        } else if (bookType.equals("fiction")) {
            lateFee = daysOverdue * 0.75;
        } else if (bookType.equals("reference")) {
            lateFee = 0; 
        } else {
            System.out.println("Invalid book type entered.");
            scanner.close();
            return;
        }
        
        System.out.printf("The total late fee is: "+ lateFee);
        
        scanner.close();
    }
}

