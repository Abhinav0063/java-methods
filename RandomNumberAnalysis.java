import java.util.Random;

public class RandomNumberAnalysis {
    // Method to generate an array of 4-digit random numbers
    public static int[] generate4DigitRandomArray(int size) {
        Random rand = new Random();
        int[] numbers = new int[size];

        for (int i = 0; i < size; i++) {
            numbers[i] = 1000 + rand.nextInt(9000); // Generates 1000 to 9999
        }
        return numbers;
    }

    // Method to find average, min, and max
    public static double[] findAverageMinMax(int[] numbers) {
        int min = numbers[0], max = numbers[0], sum = 0;

        for (int num : numbers) {
            sum += num;
            min = Math.min(min, num);
            max = Math.max(max, num);
        }
        
        return new double[]{(double) sum / numbers.length, min, max};
    }

    public static void main(String[] args) {
        int[] numbers = generate4DigitRandomArray(5);
        double[] results = findAverageMinMax(numbers);

        System.out.println("Generated numbers: " + java.util.Arrays.toString(numbers));
        System.out.println("Average: " + results[0]);
        System.out.println("Minimum: " + results[1]);
        System.out.println("Maximum: " + results[2]);
    }
}
