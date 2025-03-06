public class NumberChecker1 {

    // Method to count the number of digits in a number.
    public static int countDigits(long num) {
        // Convert the number to a string and get its length.
        return Long.toString(num).length();
    }

    // Method to store each digit of the number into an int array.
    public static int[] storeDigits(long num) {
        String numStr = Long.toString(num);
        int[] digits = new int[numStr.length()];
        for (int i = 0; i < numStr.length(); i++) {
            // Convert each character to a digit.
            digits[i] = numStr.charAt(i) - '0';
        }
        return digits;
    }

    // Method to check if a number is a duck number.
    // A duck number is defined here as a number that has at least one '0' digit not at the very start.
    public static boolean isDuckNumber(long num) {
        String numStr = Long.toString(num);
        // Start checking from index 1 to avoid leading zero.
        for (int i = 1; i < numStr.length(); i++) {
            if (numStr.charAt(i) == '0') {
                return true;
            }
        }
        return false;
    }

    // Method to check if a number is an Armstrong number.
    public static boolean isArmstrongNumber(long num) {
        int[] digits = storeDigits(num);
        int count = digits.length;
        long sum = 0;
        for (int d : digits) {
            // Sum each digit raised to the power of the total number of digits.
            sum += Math.pow(d, count);
        }
        return sum == num;
    }

    // Method to find the largest and second largest digits in the array.
    public static int[] findLargestAndSecondLargest(int[] digits) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for (int d : digits) {
            if (d > largest) {
                secondLargest = largest;
                largest = d;
            } else if (d > secondLargest && d != largest) {
                secondLargest = d;
            }
        }
        return new int[] {largest, secondLargest};
    }

    // Method to find the smallest and second smallest digits in the array.
    public static int[] findSmallestAndSecondSmallest(int[] digits) {
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;
        for (int d : digits) {
            if (d < smallest) {
                secondSmallest = smallest;
                smallest = d;
            } else if (d < secondSmallest && d != smallest) {
                secondSmallest = d;
            }
        }
        return new int[] {smallest, secondSmallest};
    }

    public static void main(String[] args) {
        long number = 153;  // Example number; 153 is an Armstrong number.
        System.out.println("Number: " + number);

        int digitCount = countDigits(number);
        System.out.println("Count of digits: " + digitCount);

        int[] digits = storeDigits(number);
        System.out.print("Digits: ");
        for (int d : digits) {
            System.out.print(d + " ");
        }
        System.out.println();

        // Check duck number (for demonstration, 153 is not a duck number)
        System.out.println("Is Duck Number? " + isDuckNumber(number));

        // Check Armstrong number
        System.out.println("Is Armstrong Number? " + isArmstrongNumber(number));

        // Find largest and second largest digits.
        int[] largestTwo = findLargestAndSecondLargest(digits);
        System.out.println("Largest digit: " + largestTwo[0] + ", Second largest digit: " + largestTwo[1]);

        // Find smallest and second smallest digits.
        int[] smallestTwo = findSmallestAndSecondSmallest(digits);
        System.out.println("Smallest digit: " + smallestTwo[0] + ", Second smallest digit: " + smallestTwo[1]);
    }
}
