import java.util.Scanner;

public class UnitConverter {
    // Conversion Constants
    private static final double KM_TO_MILES = 0.621371;
    private static final double MILES_TO_KM = 1.60934;
    private static final double METERS_TO_FEET = 3.28084;
    private static final double FEET_TO_METERS = 0.3048;

    // Method to convert kilometers to miles
    public static double convertKmToMiles(double km) {
        return km * KM_TO_MILES;
    }

    // Method to convert miles to kilometers
    public static double convertMilesToKm(double miles) {
        return miles * MILES_TO_KM;
    }

    // Method to convert meters to feet
    public static double convertMetersToFeet(double meters) {
        return meters * METERS_TO_FEET;
    }

    // Method to convert feet to meters
    public static double convertFeetToMeters(double feet) {
        return feet * FEET_TO_METERS;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose a conversion:\n1. Km to Miles\n2. Miles to Km\n3. Meters to Feet\n4. Feet to Meters");
        int choice = scanner.nextInt();

        System.out.print("Enter the value to convert: ");
        double value = scanner.nextDouble();
        double convertedValue = 0;

        switch (choice) {
            case 1:
                convertedValue = convertKmToMiles(value);
                System.out.println(value + " Km = " + convertedValue + " Miles");
                break;
            case 2:
                convertedValue = convertMilesToKm(value);
                System.out.println(value + " Miles = " + convertedValue + " Km");
                break;
            case 3:
                convertedValue = convertMetersToFeet(value);
                System.out.println(value + " Meters = " + convertedValue + " Feet");
                break;
            case 4:
                convertedValue = convertFeetToMeters(value);
                System.out.println(value + " Feet = " + convertedValue + " Meters");
                break;
            default:
                System.out.println("Invalid choice!");
        }

        scanner.close();
    }
}
