package String;

public class CheckPalindromeo {

    public static boolean isPalindrome(String input) {
        for(int i=0; i<input.length()/2; i++){
            int n = input.length();
            
            if(input.charAt(i)!= input.charAt(n-1-i)){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String input = "mansi";
        if (isPalindrome(input)) {
            System.out.println(input + " is a palindrome.");
        } else {
            System.out.println(input + " is not a palindrome.");
        }
    }

}
