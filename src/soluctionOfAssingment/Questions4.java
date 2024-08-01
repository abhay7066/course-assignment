package soluctionOfAssingment;

public class Questions4 {


        public static void main(String[] args) {
            int[] array = {92, 23, 15, -20, 10};
            int sum = findSum(array, 0);
            System.out.println("The sum of the array values is: " + sum);
        }


        public static int findSum(int[] array, int index) {

            if (index >= array.length) {
                return 0;
            }
            return array[index] + findSum(array, index + 1);
        }

}
