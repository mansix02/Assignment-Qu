package LogicalOperators;

public class CheckEligibility {
    
    public static void main(String[] args) {
        int age = 20;
        boolean isCitizen = true;

        if (isEligibleToVote(age, isCitizen)) {
            System.out.println("The person is eligible to vote.");
        } else {
            System.out.println("The person is not eligible to vote.");
        }
    }

    public static boolean isEligibleToVote(int age, boolean isCitizen) {
        return age >= 18 && isCitizen;
    }
    
}
