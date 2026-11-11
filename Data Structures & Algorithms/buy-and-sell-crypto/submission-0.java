class Solution {
    public int maxProfit(int[] prices) {

        int n = prices.length;
        int max_Profit = 0;
        int buy_Price = prices[0];
        for (int i = 1; i < n; i++) {
            int curr_profit = prices[i] - buy_Price;

            if (curr_profit > max_Profit) {
                max_Profit = curr_profit;
            }
            if (prices[i] < buy_Price) {
                buy_Price = prices[i];
            }
        }
        return max_Profit;
    }
}