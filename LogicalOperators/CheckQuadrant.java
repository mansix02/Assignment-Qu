package LogicalOperators;

public class CheckQuadrant {
    
    public static void main(String[] args) {
        int x = 3;
        int y = -4;

        String quadrant = determineQuadrant(x, y);
        System.out.println("The point (" + x + ", " + y + ") lies in " + quadrant);
    }

    public static String determineQuadrant(int x, int y) {
        if (x > 0 && y > 0) {
            return "Quadrant I";
        } else if (x < 0 && y > 0) {
            return "Quadrant II";
        } else if (x < 0 && y < 0) {
            return "Quadrant III";
        } else if (x > 0 && y < 0) {
            return "Quadrant IV";
        } else if (x == 0 && y != 0) {
            return "on the Y-axis";
        } else if (y == 0 && x != 0) {
            return "on the X-axis";
        } else {
            return "at the origin";
        }
    }
    
}
