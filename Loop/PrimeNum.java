package Loop;

public class PrimeNum {

    public static boolean checkPrime(int n){
        if(n==1 && n==2){
            return true;
        }
        for(int i=2; i<=Math.sqrt(n); i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int n=7;
        System.out.println(checkPrime(n));
    }
    
}
