public class Tasksheet120 {
    public static void main(String[] args) {
        int[] numbers = {4, 5, 10};
        cumulativeSum(numbers);
    }

    public static void cumulativeSum(int... nums) {
        int totalSum = 0;

        for (int num : nums) {
            int sum = 0;

            for (int i = 1; i <= num; i++) {
                sum += i;
            }
            totalSum += sum;

            System.out.println("Cumulative sum for " + num + ": " + sum);
        }
        System.out.println("Total sum of all cumulative sums: " + totalSum);
    }

}
