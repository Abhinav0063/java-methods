import java.util.Scanner;

public class AthleteRunCalculator {
    // Method to compute number of rounds needed to complete 5 km run
    public static int calculateRounds(double a, double b, double c) {
        double perimeter = a + b + c;
        return (int) Math.ceil(5000 / perimeter); // Rounding up to the nearest whole round
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input for triangle sides
        System.out.print("Enter the first side of the park (in meters): ");
        double a = scanner.nextDouble();

        System.out.print("Enter the second side of the park (in meters): ");
        double b = scanner.nextDouble();

        System.out.print("Enter the third side of the park (in meters): ");
        double c = scanner.nextDouble();

        // Validate input
        if (a <= 0 || b <= 0 || c <= 0) {
            System.out.println("Invalid side lengths. Sides must be greater than zero.");
        } else {
            // Calculate and display the number of rounds
            System.out.println("The athlete needs to complete " + calculateRounds(a, b, c) + " rounds to complete a 5km run.");
        }

        scanner.close();
    }
}
