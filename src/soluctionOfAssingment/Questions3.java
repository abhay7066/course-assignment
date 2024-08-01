package soluctionOfAssingment;

import static soluctionOfAssingment.Questions2.alternateSum;

public class Questions3 {
    public static void main(String[] args) {
        int n = 10; // Example input
        long result = alternateSum(n);
        System.out.println("The alternate sum of natural numbers up to " + n + " is: " + result);
    }
    public class AlternateSumRecursive {

        // Recursive method to find the sum with alternate signs
        public static long alternateSum(int n) {
            // Base case: if n is 0
            if (n == 0) {
                return 0;
            }

            // Recursive case
            if (n % 2 == 0) {
                // If n is even, subtract n
                return alternateSum(n - 1) - n;
            } else {
                // If n is odd, add n
                return alternateSum(n - 1) + n;
            }
        }


    }
}
