import java.util.Scanner;

public class LengthConverter {
    // Conversion Constants
    private static final double YARDS_TO_FEET = 3;
    private static final double FEET_TO_YARDS = 0.333333;
    private static final double METERS_TO_INCHES = 39.3701;
    private static final double INCHES_TO_METERS = 0.0254;
    private static final double INCHES_TO_CM = 2.54;

    // Conversion Methods
    public static double convertYardsToFeet(double yards) {
        return yards * YARDS_TO_FEET;
    }

    public static double convertFeetToYards(double feet) {
        return feet * FEET_TO_YARDS;
    }

    public static double convertMetersToInches(double meters) {
        return meters * METERS_TO_INCHES;
    }

    public static double convertInchesToMeters(double inches) {
        return inches * INCHES_TO_METERS;
    }

    public static double convertInchesToCm(double inches) {
        return inches * INCHES_TO_CM;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose a conversion:\n1. Yards to Feet\n2. Feet to Yards\n3. Meters to Inches\n4. Inches to Meters\n5. Inches to Centimeters");
        int choice = scanner.nextInt();

        System.out.print("Enter the value to convert: ");
        double value = scanner.nextDouble();
        double convertedValue = 0;

        switch (choice) {
            case 1:
                convertedValue = convertYardsToFeet(value);
                System.out.println(value + " Yards = " + convertedValue + " Feet");
                break;
            case 2:
                convertedValue = convertFeetToYards(value);
                System.out.println(value + " Feet = " + convertedValue + " Yards");
                break;
            case 3:
                convertedValue = convertMetersToInches(value);
                System.out.println(value + " Meters = " + convertedValue + " Inches");
                break;
            case 4:
                convertedValue = convertInchesToMeters(value);
                System.out.println(value + " Inches = " + convertedValue + " Meters");
                break;
            case 5:
                convertedValue = convertInchesToCm(value);
                System.out.println(value + " Inches = " + convertedValue + " Centimeters");
                break;
            default:
                System.out.println("Invalid choice!");
        }

        scanner.close();
    }
}
