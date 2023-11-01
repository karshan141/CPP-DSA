package Array;
import java.util.*;
public class LargetInArray {
    public static int largeNumber(int nums[]) {
        int largets = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > largets) {
                largets = nums[i];
            }
        }
        return largets;
    }

    public static void main(String[] args) {
        int numbers[] = { 10, 25, 310, 35, 40, 20, 22, 23 };
        System.out.println("Larget Values is :-" + largeNumber(numbers));
    }
}
