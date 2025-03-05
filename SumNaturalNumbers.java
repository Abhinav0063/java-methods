import java.util.Scanner;

public class SumNaturalNumbers {
    // Method to calculate sum of first n natural numbers
    public static int findSum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input
        System.out.print("Enter a positive integer (N): ");
        int n = scanner.nextInt();

        if (n < 1) {
            System.out.println("Please enter a positive integer.");
        } else {
            // Calculate and display result
            System.out.println("The sum of first " + n + " natural numbers is: " + findSum(n));
        }

        scanner.close();
    }
}
