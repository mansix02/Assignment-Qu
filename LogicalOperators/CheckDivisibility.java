package LogicalOperators;

public class CheckDivisibility {
    
    public static void main(String[] args) {
        int number = 35;

        if (isDivisibleBy5And7(number)) {
            System.out.println(number + " is divisible by both 5 and 7.");
        } else {
            System.out.println(number + " is not divisible by both 5 and 7.");
        }
    }

    public static boolean isDivisibleBy5And7(int number) {
        return (number % 5 == 0) && (number % 7 == 0);
    }
    
}
