package Array;

public class BestTimetoBuyandSellStock {

    public static int bestTimetoBuyandSellStock(int price[]) {
        // Initialize variables to keep track of the minimum price and maximum profit.
        int minPrice = price[0]; // Assume the first price is the minimum.
        int maxProfit = 0; // Initialize the maximum profit to zero.

        // Iterate through the prices starting from the second price (index 1).
        for (int i = 1; i < price.length; i++) {
            // Update the minimum price if the current price is lower.
            minPrice = Math.min(minPrice, price[i - 1]);

            // Calculate the profit that can be obtained by selling at the current price
            // and subtracting the minimum price seen so far.
            int currentProfit = price[i] - minPrice;

            // Update the maximum profit if the current profit is greater.
            maxProfit = Math.max(maxProfit, currentProfit);
        }

        // Return the maximum profit achievable.
        return maxProfit;

        /*
         * Bruet force
         * int bestPrice = 0;
         * 
         * for (int i = 0; i < price.length; i++) {
         * for (int j = i + 1; j < price.length; j++) {
         * int maxPrice = price[j] - price[i];
         * bestPrice = Math.max(bestPrice, maxPrice);
         * }
         * // System.out.println();
         * }
         * if (bestPrice < 0) {
         * bestPrice = 0;
         * }
         * return bestPrice;
         */
    }

    public static void main(String[] args) {
        int price[] = { 7, 5, 3 ,4};
        int bestPrice = bestTimetoBuyandSellStock(price);
        System.out.println(bestPrice);
    }
}
