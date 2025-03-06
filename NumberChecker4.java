public class NumberChecker4 {

    // Check if the number is a prime number.
    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        // Only check up to square root of the number.
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    // Check if the number is a neon number.
    // A neon number's square's digits sum up to the number itself.
    public static boolean isNeonNumber(int num) {
        int square = num * num;
        int sum = 0;
        while (square != 0) {
            sum += square % 10;
            square /= 10;
        }
        return sum == num;
    }

    // Check if the number is a spy number.
    // A spy number has the sum of its digits equal to the product of its digits.
    public static boolean isSpyNumber(int num) {
        int sum = 0;
        int product = 1;
        int temp = num;
        while (temp != 0) {
            int d = temp % 10;
            sum += d;
            product *= d;
            temp /= 10;
        }
        return sum == product;
    }

    // Check if the number is an automorphic number.
    // A number whose square ends with the number itself.
    public static boolean isAutomorphic(int num) {
        int square = num * num;
        String numStr = Integer.toString(num);
        String squareStr = Integer.toString(square);
        // Check if squareStr ends with numStr.
        return squareStr.endsWith(numStr);
    }

    // Check if the number is a buzz number.
    // A buzz number is either divisible by 7 or ends with 7.
    public static boolean isBuzzNumber(int num) {
        return (num % 7 == 0) || (Integer.toString(num).endsWith("7"));
    }

    public static void main(String[] args) {
        int primeTest = 29;
        System.out.println("Number " + primeTest + " is prime? " + isPrime(primeTest));

        int neonTest = 9;  // 9^2 = 81, and 8+1 = 9
        System.out.println("Number " + neonTest + " is neon? " + isNeonNumber(neonTest));

        int spyTest = 123;  // 1+2+3 = 6 and 1*2*3 = 6
        System.out.println("Number " + spyTest + " is spy? " + isSpyNumber(spyTest));

        int automorphicTest = 5;  // 5^2 = 25 ends with 5
        System.out.println("Number " + automorphicTest + " is automorphic? " + isAutomorphic(automorphicTest));

        int buzzTest = 27;  // Ends with 7
        System.out.println("Number " + buzzTest + " is buzz? " + isBuzzNumber(buzzTest));
    }
}
