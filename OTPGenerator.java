import java.util.HashSet;
import java.util.Random;

public class OTPGenerator {
    // Method to generate a 6-digit OTP
    public static int generateOTP() {
        return 100000 + new Random().nextInt(900000); // Generates a number between 100000-999999
    }

    // Method to validate OTP uniqueness
    public static boolean areOTPsUnique(int[] otps) {
        HashSet<Integer> uniqueOTPs = new HashSet<>();
        for (int otp : otps) {
            uniqueOTPs.add(otp);
        }
        return uniqueOTPs.size() == otps.length; // If size matches, all are unique
    }

    public static void main(String[] args) {
        int[] otpArray = new int[10];

        // Generate 10 OTPs
        for (int i = 0; i < 10; i++) {
            otpArray[i] = generateOTP();
        }

        // Display generated OTPs
        System.out.println("Generated OTPs: ");
        for (int otp : otpArray) {
            System.out.println(otp);
        }

        // Validate uniqueness
        if (areOTPsUnique(otpArray)) {
            System.out.println("All OTPs are unique.");
        } else {
            System.out.println("Some OTPs are repeated.");
        }
    }
}
