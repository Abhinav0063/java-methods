import java.util.Scanner;

public class FactorCalculator {
    // Method to find factors of a number
    public static int[] findFactors(int number) {
        int count = 0;

        // First loop: Count factors
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }

        // Initialize array with correct size
        int[] factors = new int[count];
        int index = 0;

        // Second loop: Store factors
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index++] = i;
            }
        }
        return factors;
    }

    // Method to calculate sum of factors
    public static int sumFactors(int[] factors) {
        int sum = 0;
        for (int factor : factors) {
            sum += factor;
        }
        return sum;
    }

    // Method to calculate product of factors
    public static long productFactors(int[] factors) {
        long product = 1;
        for (int factor : factors) {
            product *= factor;
        }
        return product;
    }

    // Method to calculate sum of squares of factors
    public static int sumSquareFactors(int[] factors) {
        int sumSquare = 0;
        for (int factor : factors) {
            sumSquare += Math.pow(factor, 2);
        }
        return sumSquare;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (number <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            int[] factors = findFactors(number);

            // Display results
            System.out.println("Factors of " + number + ": " + java.util.Arrays.toString(factors));
            System.out.println("Sum of factors: " + sumFactors(factors));
            System.out.println("Product of factors: " + productFactors(factors));
            System.out.println("Sum of squares of factors: " + sumSquareFactors(factors));
        }

        scanner.close();
    }
}
