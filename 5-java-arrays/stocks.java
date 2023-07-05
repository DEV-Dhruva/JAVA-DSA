public class stocks {

    public static int showProfit(int stocksPrices[]) {
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int i = 0; i < stocksPrices.length; i++) {
            if (buyPrice < stocksPrices[i]) { // looking for profit
                int profit = stocksPrices[i] - buyPrice; // calc profit
                maxProfit = Math.max(maxProfit, profit); // comapring for getting maxProfit
            } else {
                buyPrice = stocksPrices[i];
            }
        }

        return maxProfit;
    }

    public static void main(String[] args) {
        int stocksPrices[] = { 7, 1, 5, 3, 6, 4, };
        System.out.println(showProfit(stocksPrices));
    }
}
