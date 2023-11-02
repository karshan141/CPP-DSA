package Array;

public class TrappingRainWater {
    public static void trappingRainWater(int height[]) {

        /* Optimized Way */
        int leftLargeArray[] = new int[height.length];

        leftLargeArray[0] = height[0];

        for (int i = 1; i < height.length; i++) {

            leftLargeArray[i] = Math.max(leftLargeArray[i - 1], height[i]);
        }

        int rightLargeArray[] = new int[height.length];

        rightLargeArray[rightLargeArray.length - 1] = height[height.length - 1];

        for (int i = rightLargeArray.length - 2; i >= 0; i--) {
            rightLargeArray[i] = Math.max(height[i], rightLargeArray[i + 1]);

        }

        int water = 0;
        for (int i = 0; i < height.length; i++) {
            int trapped = Math.min(rightLargeArray[i], leftLargeArray[i]);
            water += trapped - height[i];
        }
        System.out.println(water);

        /* Optimized Way */


        /* Bruer force */
        int output = 0;
        if (height.length <= 2) {
            System.out.println("o" + output);
            return;
        }

        for (int i = 0; i < height.length; i++) {
            int leftLarge = 0;
            int rightLarge = 0;
            for (int j = i; j >= 0; j--) {
                if (height[j] > leftLarge) {
                    leftLarge = height[j];
                }
            }
            // System.err.print("Large for: " + height[i] + "is -- " + leftLarge);

            for (int j = i; j < height.length; j++) {
                if (height[j] > rightLarge) {
                    rightLarge = height[j];
                }
            }

            if (leftLarge > rightLarge) {
                output += rightLarge - height[i];
            } else {
                output += leftLarge - height[i];
            }
            // System.err.println(" Large for right: " + height[i] + "is -- " + rightLarge);
        }

        System.out.println(output);
        /* Bruer force end */
    }

    public static void main(String[] args) {
        int height[] = { 4, 2, 6, 3, 2, 4, 5 };
        trappingRainWater(height);
    }
}
