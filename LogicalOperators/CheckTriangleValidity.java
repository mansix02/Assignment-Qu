package LogicalOperators;

public class CheckTriangleValidity {
    
    public static void main(String[] args) {
        int side1 = 3;
        int side2 = 4;
        int side3 = 5;

        if (isValidTriangle(side1, side2, side3)) {
            System.out.println("The given sides form a valid triangle.");
        } else {
            System.out.println("The given sides do not form a valid triangle.");
        }
    }

    public static boolean isValidTriangle(int a, int b, int c) {
        return (a + b > c) && (a + c > b) && (b + c > a);
    }
    
}
