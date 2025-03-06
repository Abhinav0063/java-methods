import java.util.Random;

public class FootballTeamHeight {
    // Method to generate an array of random heights (150-250 cm)
    public static int[] generatePlayerHeights(int size) {
        Random rand = new Random();
        int[] heights = new int[size];

        for (int i = 0; i < size; i++) {
            heights[i] = 150 + rand.nextInt(101); // Generates a height between 150 and 250
        }
        return heights;
    }

    // Method to calculate the sum of all heights
    public static int calculateSum(int[] heights) {
        int sum = 0;
        for (int height : heights) {
            sum += height;
        }
        return sum;
    }

    // Method to calculate the mean height
    public static double calculateMean(int[] heights) {
        return (double) calculateSum(heights) / heights.length;
    }

    // Method to find the shortest height
    public static int findShortest(int[] heights) {
        int shortest = heights[0];
        for (int height : heights) {
            shortest = Math.min(shortest, height);
        }
        return shortest;
    }

    // Method to find the tallest height
    public static int findTallest(int[] heights) {
        int tallest = heights[0];
        for (int height : heights) {
            tallest = Math.max(tallest, height);
        }
        return tallest;
    }

    public static void main(String[] args) {
        int[] heights = generatePlayerHeights(11);

        // Compute results
        int sum = calculateSum(heights);
        double mean = calculateMean(heights);
        int shortest = findShortest(heights);
        int tallest = findTallest(heights);

        // Display results
        System.out.println("Football Team Heights (in cm): " + java.util.Arrays.toString(heights));
        System.out.println("Total Sum of Heights: " + sum + " cm");
        System.out.println("Mean Height: " + String.format("%.2f", mean) + " cm");
        System.out.println("Shortest Player Height: " + shortest + " cm");
        System.out.println("Tallest Player Height: " + tallest + " cm");
    }
}
