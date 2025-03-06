import java.util.Scanner;

public class StudentVoteChecker {
    // Method to check if a student can vote
    public static boolean canStudentVote(int age) {
        if (age < 0) return false; // Invalid age
        return age >= 18; // Voting eligibility
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] studentAges = new int[10];

        // Taking input for 10 students
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter age of Student " + (i + 1) + ": ");
            studentAges[i] = scanner.nextInt();
        }

        // Display voting eligibility
        System.out.println("\nVoting Eligibility:");
        for (int i = 0; i < 10; i++) {
            if (canStudentVote(studentAges[i])) {
                System.out.println("Student " + (i + 1) + " (Age: " + studentAges[i] + ") can vote.");
            } else {
                System.out.println("Student " + (i + 1) + " (Age: " + studentAges[i] + ") cannot vote.");
            }
        }

        scanner.close();
    }
}
