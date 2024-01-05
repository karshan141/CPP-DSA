package Leetcode;

import java.util.*;;

public class Q136 {


    // Simple Aproach
    public static int singleNumber(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i += 2) {
            if (nums[i] != nums[i + 1] && i < nums.length) {                
                return nums[i];
            }
        }
        return nums[nums.length - 1];
    }

    public static void main(String[] args) {
        int nums[] = { 4, 4, 2, 1, 2 };
        System.out.println(singleNumber(nums));
    }
}
