import java.util.Scanner;

public class NumberChecker {
    // Method to check if number is positive, negative, or zero
    public static int checkNumber(int num) {
        return (num > 0) ? 1 : (num < 0) ? -1 : 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        // Get result and display
        int result = checkNumber(num);
        if (result == 1) {
            System.out.println("The number is Positive.");
        } else if (result == -1) {
            System.out.println("The number is Negative.");
        } else
