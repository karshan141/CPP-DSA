package Array;

public class LinearSearch {

    // isNumberExists Function Return true if given number Exists in number Array
    // otherwithse return False
    public static boolean isNumberExists(int nums[], int key) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == key) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int numbers[] = { 10, 20, 30, 50, 60, 80, 90 };
        boolean isExist = isNumberExists(numbers, 10); // this return True
        // boolean isExist = isNumberExists(numbers, 5); // this return False

        if (isExist) {
            System.out.println("Number Exist....!");
        } else {
            System.out.println("Number Not Exist....!");
        }
    }
}
