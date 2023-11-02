package Array;

public class TrappingRainWater {
    public static void trappingRainWater(int height[]) {
        int output = 0;
        

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
    }

    public static void main(String[] args) {
        int height[] = { 4, 2, 0, 6, 3, 2, 5 };
        trappingRainWater(height);
    }
}
