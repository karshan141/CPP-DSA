package Array;

class FindFirstandLastPositionOfElementInSortedArray {

    public static int[] findFirstandLastPositionOfElementInSortedArray(int nums[], int key) {
        int result[] = { -1, -1 };
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (key == nums[mid]) {

                int startIndex = mid;
                while (nums[startIndex] == key && startIndex >= 0) {
                    startIndex--;
                }

                int endIndex = mid;
                while (nums[endIndex] == key && endIndex < nums.length) {
                    endIndex++;
                }
                result[0] = startIndex + 1;
                result[1] = endIndex - 1;

                return result;
            } else if (key > nums[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int numbers[] = { 5, 7, 7, 7, 8, 10 };
        int result[] = findFirstandLastPositionOfElementInSortedArray(numbers, 0);
        System.out.println(result[0] + ","+ result[1]);
    }

}