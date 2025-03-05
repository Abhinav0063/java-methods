import java.util.Scanner;

public class SimpleInterestCalculator {
    // Method to calculate simple interest
    public static double calculateSimpleInterest(double principal, double rate, double time) {
        return (principal * rate * time) / 100;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input
        System.out.print("Enter Principal Amount: ");
        double principal = scanner.nextDouble();

        System.out.print("Enter Rate of Interest: ");
        double rate = scanner.nextDouble();

        System.out.print("Enter Time (in years): ");
        double time = scanner.nextDouble();

        // Calculating Simple Interest
        double interest = calculateSimpleInterest(principal, rate, time);

        // Display result
        System.out.println("The Simple Interest is " + interest + " for Principal " + principal +
                ", Rate of Interest " + rate + " and Time " + time);

        scanner.close();
    }
}
