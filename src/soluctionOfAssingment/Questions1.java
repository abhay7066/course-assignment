package soluctionOfAssingment;

/* Given an integer, find out the sum of its digits using recursion.
        Input: n= 1234
        Output: 10

 */

public class Questions1 {
    public static void main(String[] args) {

            int number = 1234;
            int result = sumOfDigits(number);
            System.out.println("Sum of digits of " + number + " is: " + result);

    }
        public static int sumOfDigits(int n) {
            // Base case: when n is 0
            if (n == 0) {
                return 0;
            } else {
                // Recursive case: get last digit and add to sum of digits of the remaining number
                return n % 10 + sumOfDigits(n / 10);
            }
        }
    }


