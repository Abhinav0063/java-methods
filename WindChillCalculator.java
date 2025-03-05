import java.util.Scanner;

public class WindChillCalculator {
    // Method to calculate wind chill
    public static double calculateWindChill(double temperature, double windSpeed) {
        return 35.74 + (0.6215 * temperature) + ((0.4275 * temperature - 35.75) * Math.pow(windSpeed, 0.16));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input
        System.out.print("Enter the temperature (in Fahrenheit): ");
        double temperature = scanner.nextDouble();

        System.out.print("Enter the wind speed (in mph): ");
        double windSpeed = scanner.nextDouble();

        if (windSpeed < 0) {
            System.out.println("Wind speed cannot be negative.");
        } else {
            // Compute and display result
            double windChill = calculateWindChill(temperature, windSpeed);
            System.out.println("The wind chill temperature is: " + windChill);
        }

        scanner.close();
    }
}
