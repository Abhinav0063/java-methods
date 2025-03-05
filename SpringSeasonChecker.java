import java.util.Scanner;

public class SpringSeasonChecker {
    // Method to check if the given month and day falls in spring season
    public static boolean isSpringSeason(int month, int day) {
        return (month == 3 && day >= 20) || (month == 4) || (month == 5) || (month == 6 && day <= 20);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input for month and day
        System.out.print("Enter the month (1-12): ");
        int month = scanner.nextInt();

        System.out.print("Enter the day (1-31): ");
        int day = scanner.nextInt();

        // Validate input
        if (month < 1 || month > 12 || day < 1 || day > 31) {
            System.out.println("Invalid date input!");
        } else {
            // Check and display the result
            if (isSpringSeason(month, day)) {
                System.out.println("It's a Spring Season.");
            } else {
                System.out.println("Not a Spring Season.");
            }
        }

        scanner.close();
    }
}
