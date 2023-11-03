package Array;

public class SearchinRotatedSortedArray {
    public static int searchinRotatedSortedArray(int nums[], int key) {

        if (nums.length == 1) {
            if (nums[0] == key) {
                return 0;
            } else {
                return -1;
            }
        }
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {

            int mid = (start + end) / 2;
            System.out.println(start + " -- " + end + " mid : " + mid);

            if (nums[mid] == key) {
                return mid;
            } else if (key > nums[start]) {
                if (key > nums[mid] && nums[mid] < nums[mid + 1]) {

                    start = mid + 1;
                } else {
                    end = mid - 1;
                }

            } else {
                if (key < nums[mid] && nums[mid] >= nums[mid]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int nums[] = { 1, 3 };
        int key = 4;
        int index = searchinRotatedSortedArray(nums, key);
        System.out.println(index);
    }
}
