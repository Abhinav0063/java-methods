import java.util.Scanner;

public class SumNaturalRecursive {
    // Recursive method to calculate sum of first N natural numbers
    public static int sumRecursion(int n) {
        if (n == 1) return 1;
        return n + sumRecursion(n - 1);
    }

    // Method to calculate sum using formula
    public static int sumFormula(int n) {
        return (n * (n + 1)) / 2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input
        System.out.print("Enter a positive integer (N): ");
        int n = scanner.nextInt();

        if (n < 1) {
            System.out.println("Please enter a positive integer.");
        } else {
            int sumByRecursion = sumRecursion(n);
            int sumByFormula = sumFormula(n);

            // Display results
            System.out.println("Sum using recursion: " + sumByRecursion);
            System.out.println("Sum using formula: " + sumByFormula);
            System.out.println("Both methods produce the same result: " + (sumByRecursion == sumByFormula));
        }

        scanner.close();
    }
}
