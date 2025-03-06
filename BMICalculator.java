import java.util.Scanner;

public class BMICalculator {
    // Method to calculate BMI
    public static double calculateBMI(double weight, double heightCm) {
        double heightM = heightCm / 100.0; // Convert cm to meters
        return weight / (heightM * heightM);
    }

    // Method to determine BMI status
    public static String getBMIStatus(double bmi) {
        if (bmi <= 18.4) return "Underweight";
        else if (bmi <= 24.9) return "Normal";
        else if (bmi <= 39.9) return "Overweight";
        else return "Obese";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] bmiData = new double[10][3]; // [weight, height, BMI]
        String[] bmiStatus = new String[10];

        // Taking input for 10 people
        for (int i = 0; i < 10; i++) {
            System.out.print("\nEnter weight (kg) for person " + (i + 1) + ": ");
            bmiData[i][0] = scanner.nextDouble();

            System.out.print("Enter height (cm) for person " + (i + 1) + ": ");
            bmiData[i][1] = scanner.nextDouble();

            // Calculate BMI and determine status
            bmiData[i][2] = calculateBMI(bmiData[i][0], bmiData[i][1]);
            bmiStatus[i] = getBMIStatus(bmiData[i][2]);
        }

        // Display results
        System.out.println("\nBMI Report:");
        System.out.printf("%-10s %-10s %-10s %-15s%n", "Weight(kg)", "Height(cm)", "BMI", "Status");
        for (int i = 0; i < 10; i++) {
            System.out.printf("%-10.2f %-10.2f %-10.2f %-15s%n",
                    bmiData[i][0], bmiData[i][1], bmiData[i][2], bmiStatus[i]);
        }

        scanner.close();
    }
}
