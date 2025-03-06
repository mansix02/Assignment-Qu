package array;

public class saerching {
    public static void main(String[] args) {
        int arr[] ={2,3,4,5,6,7};
        int key =6;
        for(int i=0; i<=arr.length; i++){
            if(arr[i]==key){
                System.out.println("Index value = " + i);
            }
        }
    }
}
