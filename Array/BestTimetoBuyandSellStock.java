package Array;

public class BestTimetoBuyandSellStock {

    public static int bestTimetoBuyandSellStock(int price[]) {

        int minPrice = price[0];
        int maxProfit = 0;

        for (int i = 1; i < price.length; i++) {
            minPrice = Math.min(minPrice, price[i - 1]);
            maxProfit = Math.max(maxProfit, (price[i] - minPrice));
        }

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
        int price[] = { 7,  5, 3 };
        int bestPrice = bestTimetoBuyandSellStock(price);
        System.out.println(bestPrice);
    }
}
