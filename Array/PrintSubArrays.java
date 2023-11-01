/*
 * PrintSubArrays
 * 
 * This program generates and prints all subarrays from an integer array.
 * It iterates through the array and prints each subarray.
 * For the given example input {2, 4, 6, 8, 10}, it generates subarrays like:
 * 2,
 * 2, 4, 
 * 2, 4, 6, 
 * 2, 4, 6, 8, 
 * 2, 4, 6, 8, 10, 
 * 4, 
 * 4, 6, 
 * 4, 6, 8, 
 * 4, 6, 8, 10, 
 * 6, 
 * 6, 8, 
 * 6, 8, 10, 
 * 8, 
 * 8, 10, 
 * 10,
 */
package Array;

public class PrintSubArrays {
    /**
     * Generates and prints all subarrays from an integer array.
     * 
     * @param nums The array from which subarrays are generated and printed.
     */

    // public static void printSubArrays(int nums[]) {
    // for (int i = 0; i < nums.length; i++) {
    // int start = i;
    // int end = start;
    // while (end < nums.length) {
    // int sum = 0;
    // for (int j = start; j <= end; j++) {
    // System.err.print(nums[j] + " ");
    // sum+= nums[j];
    // }
    // System.err.print(" Sum is: " + sum + " ");
    // end++;
    // }
    // System.err.println();
    // }
    // }

    public static void printSubArrays(int nums[]) {
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    sum += nums[k];
                    // System.out.print(nums[k] + ",");
                }
                if(sum>maxSum){
                    maxSum = sum;
                }
                System.out.println(" Sum is:  " + sum );

            }
            System.out.println();
        }
        System.out.println(maxSum);
    }

    public static void main(String[] args) {
        int numbers[] = { 2, -4, 6, 8, -10 };

        // Generate and print subarrays from the array.
        printSubArrays(numbers);
    }
}
