import java.util.Scanner;

public class GeneralConverter {
    // Conversion Constants
    private static final double POUNDS_TO_KG = 0.453592;
    private static final double KG_TO_POUNDS = 2.20462;
    private static final double GALLONS_TO_LITERS = 3.78541;
    private static final double LITERS_TO_GALLONS = 0.264172;

    // Conversion Methods
    public static double convertFahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static double convertCelsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static double convertPoundsToKilograms(double pounds) {
        return pounds * POUNDS_TO_KG;
    }

    public static double convertKilogramsToPounds(double kilograms) {
        return kilograms * KG_TO_POUNDS;
    }

    public static double convertGallonsToLiters(double gallons) {
        return gallons * GALLONS_TO_LITERS;
    }

    public static double convertLitersToGallons(double liters) {
        return liters * LITERS_TO_GALLONS;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose a conversion:\n1. Fahrenheit to Celsius\n2. Celsius to Fahrenheit\n3. Pounds to Kilograms\n4. Kilograms to Pounds\n5. Gallons to Liters\n6. Liters to Gallons");
        int choice = scanner.nextInt();

        System.out.print("Enter the value to convert: ");
        double value = scanner.nextDouble();
        double convertedValue = 0;

        switch (choice) {
            case 1:
                convertedValue = convertFahrenheitToCelsius(value);
                System.out.println(value + "°F = " + convertedValue + "°C");
                break;
            case 2:
                convertedValue = convertCelsiusToFahrenheit(value);
                System.out.println(value + "°C = " + convertedValue + "°F");
                break;
            case 3:
                convertedValue = convertPoundsToKilograms(value);
                System.out.println(value + " Pounds = " + convertedValue + " Kilograms");
                break;
            case 4:
                convertedValue = convertKilogramsToPounds(value);
                System.out.println(value + " Kilograms = " + convertedValue + " Pounds");
                break;
            case 5:
                convertedValue = convertGallonsToLiters(value);
                System.out.println(value + " Gallons = " + convertedValue + " Liters");
                break;
            case 6:
                convertedValue = convertLitersToGallons(value);
                System.out.println(value + " Liters = " + convertedValue + " Gallons");
                break;
            default:
                System.out.println("Invalid choice!");
        }

        scanner.close();
    }
}
