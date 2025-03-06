public class NumberChecker2 {

    // Count the digits in the number.
    public static int countDigits(long num) {
        return Long.toString(num).length();
    }

    // Store digits in an int array.
    public static int[] storeDigits(long num) {
        String numStr = Long.toString(num);
        int[] digits = new int[numStr.length()];
        for (int i = 0; i < numStr.length(); i++) {
            digits[i] = numStr.charAt(i) - '0';
        }
        return digits;
    }

    // Sum the digits of the number.
    public static int sumOfDigits(long num) {
        int[] digits = storeDigits(num);
        int sum = 0;
        for (int d : digits) {
            sum += d;
        }
        return sum;
    }

    // Sum of the squares of the digits.
    public static double sumOfSquaresOfDigits(long num) {
        int[] digits = storeDigits(num);
        double sumSquares = 0;
        for (int d : digits) {
            sumSquares += Math.pow(d, 2);
        }
        return sumSquares;
    }

    // Check if the number is a Harshad number.
    // A number is Harshad if it is divisible by the sum of its digits.
    public static boolean isHarshadNumber(long num) {
        int sum = sumOfDigits(num);
        // Avoid division by zero.
        return sum != 0 && num % sum == 0;
    }

    // Find the frequency of each digit in the number.
    // Returns a 2D array where first column is the digit and second column is its frequency.
    public static int[][] frequencyOfDigits(long num) {
        int[] digits = storeDigits(num);
        // There are 10 possible digits (0-9).
        int[] freq = new int[10];
        for (int d : digits) {
            freq[d]++;
        }
        // Count how many digits actually appear.
        int count = 0;
        for (int f : freq) {
            if (f > 0) count++;
        }
        // Build the 2D array.
        int[][] result = new int[count][2];
        int index = 0;
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > 0) {
                result[index][0] = i;      // the digit
                result[index][1] = freq[i];  // its frequency
                index++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        long number = 21;  // Example number; 21 is a Harshad number (2+1 = 3 and 21 % 3 == 0)
        System.out.println("Number: " + number);

        System.out.println("Count of digits: " + countDigits(number));

        int[] digits = storeDigits(number);
        System.out.print("Digits: ");
        for (int d : digits) {
            System.out.print(d + " ");
        }
        System.out.println();

        System.out.println("Sum of digits: " + sumOfDigits(number));
        System.out.println("Sum of squares of digits: " + sumOfSquaresOfDigits(number));
        System.out.println("Is Harshad Number? " + isHarshadNumber(number));

        // Frequency of each digit.
        int[][] frequency = frequencyOfDigits(number);
        System.out.println("Frequency of digits (Digit: Frequency):");
        for (int[] entry : frequency) {
            System.out.println(entry[0] + ": " + entry[1]);
        }
    }
}
