import java.util.Scanner;

public class NumberChecker {
    // Method to check if a number is positive
    public static boolean isPositive(int number) {
        return number >= 0;
    }

    // Method to check if a number is even
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    // Method to compare first and last number
    public static int compare(int number1, int number2) {
        return Integer.compare(number1, number2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];

        // Taking input
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < 5; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Checking positive/negative and even/odd
        System.out.println("\nNumber Analysis:");
        for (int number : numbers) {
            if (isPositive(number)) {
                System.out.print(number + " is Positive ");
                System.out.println(isEven(number) ? "and Even." : "and Odd.");
            } else {
                System.out.println(number + " is Negative.");
            }
        }

        // Comparing first and last element
        int comparison = compare(numbers[0], numbers[4]);
        System.out.print("\nComparison of First & Last Elements: ");
        if (comparison > 0) {
            System.out.println("First number is greater.");
        } else if (comparison < 0) {
            System.out.println("First number is smaller.");
        } else {
            System.out.println("Both numbers are equal.");
        }

        scanner.close();
    }
}
