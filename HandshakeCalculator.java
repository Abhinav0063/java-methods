import java.util.Scanner;

public class HandshakeCalculator {
    // Method to calculate maximum handshakes
    public static int maxHandshakes(int n) {
        return (n * (n - 1)) / 2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input
        System.out.print("Enter the number of students: ");
        int n = scanner.nextInt();

        // Edge case
        if (n < 2) {
            System.out.println("Not enough students to perform handshakes.");
        } else {
            // Calculate and display result
            System.out.println("The maximum number of handshakes is: " + maxHandshakes(n));
        }

        scanner.close();
    }
}
