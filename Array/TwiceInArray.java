package Array;

import java.util.*;
public class TwiceInArray {

    public static boolean twiceInArray(int nums[]) {

        //Sort Array
            Arrays.sort(nums);

            for (int i = 1; i < nums.length; i++) {
                if(nums[i-1] == nums[i]){
                    return true;
                }
            }

            return false;
    }

    public static void main(String[] args) {
        int numbers[] = { 1, 1, 1, 3, 3, 4, 3, 2, 4, 2 };
        boolean isDublicate = twiceInArray(numbers);
        System.out.println(isDublicate);
    }
}
