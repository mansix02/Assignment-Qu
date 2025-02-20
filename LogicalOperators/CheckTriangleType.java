package LogicalOperators;

public class CheckTriangleType {
    
    public static void main(String[] args) {
        int side1 = 5;
        int side2 = 5;
        int side3 = 5;

        String triangleType = determineTriangleType(side1, side2, side3);
        System.out.println("The triangle is " + triangleType + ".");
    }

    public static String determineTriangleType(int a, int b, int c) {
        if (a == b && b == c) {
            return "equilateral";
        } else if (a == b || b == c || a == c) {
            return "isosceles";
        } else {
            return "scalene";
        }
    }
    
}
