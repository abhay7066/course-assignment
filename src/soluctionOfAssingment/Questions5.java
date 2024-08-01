package soluctionOfAssingment;

public class Questions5 {




        public static void main(String[] args) {
            int number1 = 153; // Example input 1
            int number2 = 134; // Example input 2

            // Check if the numbers are Armstrong numbers
            System.out.println(number1 + " is an Armstrong number: " + (isArmstrong(number1) ? "Yes" : "No"));
            System.out.println(number2 + " is an Armstrong number: " + (isArmstrong(number2) ? "Yes" : "No"));
        }

        // Public method to check if a number is an Armstrong number
        public static boolean isArmstrong(int n) {
            // Get the number of digits in the number
            int numDigits = countDigits(n, 0);
            // Start the recursive check with initial sum 0
            return isArmstrongHelper(n, numDigits, 0);
        }

        // Recursive method to count the number of digits
        private static int countDigits(int n, int count) {
            if (n == 0) {
                return count == 0 ? 1 : count; // Handle edge case for 0
            }
            return countDigits(n / 10, count + 1);
        }

        // Recursive method to check if a number is an Armstrong number
        private static boolean isArmstrongHelper(int n, int numDigits, int sum) {
            if (n == 0) {
                return sum == originalNumber;
            }

            // Extract the last digit
            int digit = n % 10;
            // Calculate the power of the digit
            int power = (int) Math.pow(digit, numDigits);
            // Add to the sum
            sum += power;

            // Recur with the remaining number
            return isArmstrongHelper(n / 10, numDigits, sum);
        }

        // Store the original number for comparison
        private static int originalNumber;

        // Set the original number
        private static void setOriginalNumber(int n) {
            originalNumber = n;
        }

}

