package array;

public class MaxMin {

    public static int max(int nums[]){
        int largestNum = Integer.MIN_VALUE;
        for(int i=0; i<nums.length; i++){
            if(largestNum<nums[i]){
                largestNum = nums[i];
            }
        }
        return largestNum;
    }

    public static int min(int nums[]){
        int smallestNum = Integer.MAX_VALUE;
        for(int i=0; i<nums.length; i++){
            if(smallestNum>nums[i]){
                smallestNum = nums[i];
            }
        }
        return smallestNum;
    }
    
    public static void main(String[] args) {
        int nums[]={2,1,3,7,9,10,5};
        System.out.println(max(nums));
        System.out.println(min(nums));
    }
}
