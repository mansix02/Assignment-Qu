package LogicalOperators;

public class CheckEmployeeEligibility {
    
    public static void main(String[] args) {
        int hoursWorked = 45;
        boolean isFullTime = true;

        if (isEligibleForOvertime(hoursWorked, isFullTime)) {
            System.out.println("The employee is eligible for overtime pay.");
        } else {
            System.out.println("The employee is not eligible for overtime pay.");
        }
    }

    public static boolean isEligibleForOvertime(int hoursWorked, boolean isFullTime) {
        return hoursWorked > 40 && isFullTime;
    }
    
}
