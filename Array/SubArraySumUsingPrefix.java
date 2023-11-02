package Array;

public class SubArraySumUsingPrefix {
    public static void printSubArrays(int nums[]) {
        int maxSum = Integer.MIN_VALUE; // Initialize the maximum sum to the lowest possible value.
        int sum = 0;
        int prefixArray[] = new int[nums.length];

        // Calculate the prefix sum array
        prefixArray[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            prefixArray[i] = prefixArray[i - 1] + nums[i];
        }

        // Iterate through all subarrays and find the maximum sum
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                // Calculate the sum of the subarray using the prefix array
                sum = (i == 0) ? prefixArray[j] : prefixArray[j] - prefixArray[i - 1];
                if (sum > maxSum) {
                    maxSum = sum;
                }
                // System.out.println("Sum is: " + sum);
            }
            // System.out.println();
        }
        System.out.println("Max sum is: " + maxSum);

    }

    public static void kanadeAlgo(int nums[]) {
        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            currentSum += nums[i];
            
            maxSum = Math.max(currentSum, maxSum);
            if (currentSum < 0) {
                currentSum = 0;
            }
        }

        System.out.println(maxSum);
    }

    public static void main(String[] args) {
        int numbers[] = { -21, -2, -6, -10, -1 };
        printSubArrays(numbers);
        kanadeAlgo(numbers);
    }
}
