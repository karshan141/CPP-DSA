/*
 * PairsInArray
 * 
 * This program generates and prints all unique pairs from an integer array.
 * It iterates through the array and prints each pair of elements.
 * For the given example input {2, 4, 6, 8, 10}, it generates pairs like:
 * {2,4} {2,6} {2,8} {2,10}
 * {4,6} {4,8} {4,10}
 * {6,8} {6,10}
 * {8,10}
 */
package Array;

public class PairsInArray {

    /**
     * Generates and prints all unique pairs from an integer array.
     * 
     * @param nums The array from which pairs are generated and printed.
     */
    public static void pairsInArray(int nums[]) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                System.out.print("{" + nums[i] + "," + nums[j] + "} ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int numbers[] = { 2, 4, 6, 8, 10 };
        
        // Generate and print pairs from the array.
        pairsInArray(numbers);
    }
}
