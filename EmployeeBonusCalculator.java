import java.util.Random;

public class EmployeeBonusCalculator {
    private static final int NUM_EMPLOYEES = 10;

    // Method to generate random salary (5-digit) and years of service
    public static int[][] generateEmployeeData() {
        Random random = new Random();
        int[][] employees = new int[NUM_EMPLOYEES][2]; // [salary, years of service]

        for (int i = 0; i < NUM_EMPLOYEES; i++) {
            employees[i][0] = 10000 + random.nextInt(90000); // Salary between 10000-99999
            employees[i][1] = 1 + random.nextInt(10); // Years of service between 1-10
        }
        return employees;
    }

    // Method to calculate new salary and bonus
    public static double[][] calculateBonuses(int[][] employees) {
        double[][] salaryData = new double[NUM_EMPLOYEES][2]; // [new salary, bonus]

        for (int i = 0; i < NUM_EMPLOYEES; i++) {
            double bonusPercentage = (employees[i][1] > 5) ? 0.05 : 0.02;
            double bonus = employees[i][0] * bonusPercentage;
            salaryData[i][0] = employees[i][0] + bonus;
            salaryData[i][1] = bonus;
        }
        return salaryData;
    }

    // Method to calculate total sums
    public static void displayResults(int[][] employees, double[][] salaryData) {
        double totalOldSalary = 0, totalNewSalary = 0, totalBonus = 0;

        System.out.printf("%-5s %-10s %-10s %-10s %-10s %-10s%n", "ID", "Salary", "Years", "Bonus", "New Salary");
        for (int i = 0; i < NUM_EMPLOYEES; i++) {
            totalOldSalary += employees[i][0];
            totalNewSalary += salaryData[i][0];
            totalBonus += salaryData[i][1];

            System.out.printf("%-5d %-10d %-10d %-10.2f %-10.2f%n", (i + 1), employees[i][0], employees[i][1], salaryData[i][1], salaryData[i][0]);
        }

        System.out.printf("\nTotal Old Salary: %.2f%n", totalOldSalary);
        System.out.printf("Total New Salary: %.2f%n", totalNewSalary);
        System.out.printf("Total Bonus Paid: %.2f%n", totalBonus);
    }

    public static void main(String[] args) {
        int[][] employees = generateEmployeeData();
        double[][] salaryData = calculateBonuses(employees);
        displayResults(employees, salaryData);
    }
}
