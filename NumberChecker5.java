public class NumberChecker5 {

    // Method to find the factors of a number and return them as an array.
    public static int[] getFactors(int num) {
        // First count how many factors there are.
        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
        }
        // Create an array to store the factors.
        int[] factors = new int[count];
        int index = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                factors[index++] = i;
            }
        }
        return factors;
    }

    // Method to find the greatest factor from the factors array.
    public static int getGreatestFactor(int[] factors) {
        int greatest = Integer.MIN_VALUE;
        for (int f : factors) {
            if (f > greatest) {
                greatest = f;
            }
        }
        return greatest;
    }

    // Method to find the sum of the factors.
    public static int getSumOfFactors(int[] factors) {
        int sum = 0;
        for (int f : factors) {
            sum += f;
        }
        return sum;
    }

    // Method to find the product of the factors.
    public static long getProductOfFactors(int[] factors) {
        long product = 1;
        for (int f : factors) {
            product *= f;
        }
        return product;
    }

    // Method to find the product of the cubes of the factors.
    public static double getProductOfCubesOfFactors(int[] factors) {
        double product = 1;
        for (int f : factors) {
            product *= Math.pow(f, 3);
        }
        return product;
    }

    // Check if a number is a perfect number.
    // A perfect number equals the sum of its proper divisors (excluding itself).
    public static boolean isPerfectNumber(int num) {
        int sum = 0;
        // Loop until num/2 because no proper divisor (other than the number itself) is greater than num/2.
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        return sum == num;
    }

    // Check if a number is an abundant number.
    // Sum of proper divisors greater than the number.
    public static boolean isAbundantNumber(int num) {
        int sum = 0;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        return sum > num;
    }

    // Check if a number is a deficient number.
    // Sum of proper divisors less than the number.
    public static boolean isDeficientNumber(int num) {
        int sum = 0;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        return sum < num;
    }

    // Method to check if a number is a strong number.
    // A strong number equals the sum of factorials of its digits.
    public static boolean isStrongNumber(int num) {
        int temp = num;
        int sumFactorials = 0;
        while (temp != 0) {
            int d = temp % 10;
            sumFactorials += factorial(d);
            temp /= 10;
        }
        return sumFactorials == num;
    }

    // Helper method to compute factorial.
    public static int factorial(int n) {
        int fact = 1;
        for (int i = 2; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {
        int number = 28;  // Example for factor related operations (28 is a perfect number).
        System.out.println("Number: " + number);

        // Get factors.
        int[] factors = getFactors(number);
        System.out.print("Factors: ");
        for (int f : factors) {
            System.out.print(f + " ");
        }
        System.out.println();

        System.out.println("Greatest Factor: " + getGreatestFactor(factors));
        System.out.println("Sum of Factors: " + getSumOfFactors(factors));
        System.out.println("Product of Factors: " + getProductOfFactors(factors));
        System.out.println("Product of Cubes of Factors: " + getProductOfCubesOfFactors(factors));

        // Check perfect, abundant, and deficient.
        System.out.println("Is Perfect Number? " + isPerfectNumber(number));
        System.out.println("Is Abundant Number? " + isAbundantNumber(number));
        System.out.println("Is Deficient Number? " + isDeficientNumber(number));

        // Check strong number using a different sample.
        int strongTest = 145; // 1! + 4! + 5! = 145
        System.out.println("Number " + strongTest + " is Strong Number? " + isStrongNumber(strongTest));
    }
}
