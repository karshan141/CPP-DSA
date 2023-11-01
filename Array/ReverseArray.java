package Array;

class ReverseArray {

    // Function to reverse the elements of an array in-place.
    public static void reverseArray(int nums[]) {
        int start = 0;
        int end = nums.length - 1;

        // Swap elements from start to end and move towards the center.
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int numbers[] = { 2, 4, 6, 8, 10, 12 };

        // Reverse the array.
        reverseArray(numbers);

        // Print the reversed array.
        for (int i = 0; i < numbers.length; i++) {
            System.err.print(numbers[i] + " ");
        }
    }
}
