import java.util.Scanner;

public class LeapYearChecker {
    // Method to check for Leap Year
    public static boolean isLeapYear(int year) {
        if (year < 1582) {
            return false;
        }
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();

        if (year < 1582) {
            System.out.println("Year must be >= 1582 (Gregorian Calendar).");
        } else {
            System.out.println(year + (isLeapYear(year) ? " is a Leap Year." : " is NOT a Leap Year."));
        }

        scanner.close();
    }
}
