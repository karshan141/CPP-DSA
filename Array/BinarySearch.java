/*
 * This is a binary search implementation in Java.
 * It searches for a key in a sorted array.
 * Assumes the array is in ascending order.
 */
package Array;

public class BinarySearch {

    /**
     * Searches for a key in a sorted array using binary search.
     *
     * @param nums The sorted array to search in.
     * @param key  The value to search for.
     * @return True if the key is found, false otherwise.
     */

    public static boolean binarySearch(int nums[], int key) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;
            if (key == nums[mid]) {
                return true; // Key found.
            } else if (key > nums[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }

        }
        return false; // Key not found
    }

    public static void main(String[] args) {
        int numbers[] = { 1, 5, 10, 15, 18, 20, 23, 203, 505, 1222 };
        boolean isExist = binarySearch(numbers, 203);

        if (isExist) {
            System.out.println("Number Exist....!");
        } else {
            System.out.println("Number Not Exist....!");
        }
    }
}
