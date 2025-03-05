import java.util.Scanner;

public class TrigonometricCalculator {
    // Method to calculate sine, cosine, and tangent
    public static double[] calculateTrigonometricFunctions(double angle) {
        double radians = Math.toRadians(angle);
        return new double[]{Math.sin(radians), Math.cos(radians), Math.tan(radians)};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input
        System.out.print("Enter an angle in degrees: ");
        double angle = scanner.nextDouble();

        // Compute and display result
        double[] trigValues = calculateTrigonometricFunctions(angle);
        System.out.println("Sine: " + trigValues[0]);
        System.out.println("Cosine: " + trigValues[1]);
        System.out.println("Tangent: " + trigValues[2]);

        scanner.close();
    }
}
