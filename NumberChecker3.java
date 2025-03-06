import java.util.Arrays;

public class NumberChecker3 {

    // Count the number of digits in the number.
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

    // Reverse the digits array.
    public static int[] reverseArray(int[] arr) {
        int[] reversed = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            reversed[i] = arr[arr.length - 1 - i];
        }
        return reversed;
    }

    // Compare two arrays to check if they are equal.
    public static boolean compareArrays(int[] arr1, int[] arr2) {
        return Arrays.equals(arr1, arr2);
    }

    // Check if a number is a palindrome using the digits array.
    public static boolean isPalindrome(long num) {
        int[] digits = storeDigits(num);
        int[] reversed = reverseArray(digits);
        return compareArrays(digits, reversed);
    }

    // Check if the number is a duck number.
    // A duck number is defined as having at least one zero not in the first position.
    public static boolean isDuckNumber(long num) {
        String numStr = Long.toString(num);
        for (int i = 1; i < numStr.length(); i++) {
            if (numStr.charAt(i) == '0') {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        long number = 121;  // Example number; 121 is a palindrome.
        System.out.println("Number: " + number);
        System.out.println("Count of digits: " + countDigits(number));

        int[] digits = storeDigits(number);
        System.out.print("Digits: ");
        for (int d : digits) {
            System.out.print(d + " ");
        }
        System.out.println();

        // Reverse the digits array.
        int[] reversed = reverseArray(digits);
        System.out.print("Reversed Digits: ");
        for (int d : reversed) {
            System.out.print(d + " ");
        }
        System.out.println();

        // Check if the number is a palindrome.
        System.out.println("Is Palindrome? " + isPalindrome(number));

        // Check if the number is a duck number.
        System.out.println("Is Duck Number? " + isDuckNumber(number));
    }
}
