import java.util.Random;
import java.util.Scanner;

public class StudentScorecard {
    // Method to generate random PCM scores for students
    public static int[][] generateScores(int numStudents) {
        Random rand = new Random();
        int[][] scores = new int[numStudents][3]; // [Physics, Chemistry, Maths]

        for (int i = 0; i < numStudents; i++) {
            scores[i][0] = 50 + rand.nextInt(51); // Physics (50-100)
            scores[i][1] = 50 + rand.nextInt(51); // Chemistry (50-100)
            scores[i][2] = 50 + rand.nextInt(51); // Math (50-100)
        }
        return scores;
    }

    // Method to calculate total, average, and percentage
    public static double[][] calculateResults(int[][] scores) {
        int numStudents = scores.length;
        double[][] results = new double[numStudents][3]; // [Total, Average, Percentage]

        for (int i = 0; i < numStudents; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;

            results[i][0] = total;
            results[i][1] = Math.round(average * 100.0) / 100.0;
            results[i][2] = Math.round(percentage * 100.0) / 100.0;
        }
        return results;
    }

    // Method to display the scorecard
    public static void displayScorecard(int[][] scores, double[][] results) {
        System.out.println("\nStudent Scorecard:");
        System.out.printf("%-5s %-10s %-10s %-10s %-10s %-10s %-10s%n", "ID", "Physics", "Chemistry", "Maths", "Total", "Average", "Percentage");
        System.out.println("--------------------------------------------------------------------------------");

        for (int i = 0; i < scores.length; i++) {
            System.out.printf("%-5d %-10d %-10d %-10d %-10.2f %-10.2f %-10.2f%n",
                    (i + 1), scores[i][0], scores[i][1], scores[i][2], results[i][0], results[i][1], results[i][2]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input for number of students
        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();

        // Generate random PCM scores
        int[][] scores = generateScores(numStudents);

        // Calculate total, average, and percentage
        double[][] results = calculateResults(scores);

        // Display the final scorecard
        displayScorecard(scores, results);

        scanner.close();
    }
}
