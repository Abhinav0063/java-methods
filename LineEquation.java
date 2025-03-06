import java.util.Scanner;

public class LineEquation {
    // Method to compute Euclidean distance
    public static double calculateDistance(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    // Method to compute slope and y-intercept
    public static double[] findLineEquation(int x1, int y1, int x2, int y2) {
        double slope = (double) (y2 - y1) / (x2 - x1);
        double intercept = y1 - slope * x1;
        return new double[]{slope, intercept}; // {m, b}
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input for two points
        System.out.print("Enter x1, y1: ");
        int x1 = scanner.nextInt(), y1 = scanner.nextInt();
        System.out.print("Enter x2, y2: ");
        int x2 = scanner.nextInt(), y2 = scanner.nextInt();

        // Calculate Euclidean distance
        double distance = calculateDistance(x1, y1, x2, y2);
        System.out.printf("Euclidean Distance: %.2f%n", distance);

        // Find equation of the line
        double[] equation = findLineEquation(x1, y1, x2, y2);
        System.out.printf("Equation of Line: y = %.2fx + %.2f%n", equation[0], equation[1]);

        scanner.close();
    }
}
