class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int valley = 0;
        int peak = 0;
        int profit = 0;
        int i = 0;

        while (i < n - 1) {

            while (i < n - 1 && prices[i] >= prices[i + 1]) {
                i++;
            }

            valley = prices[i];

            while (i < n - 1 && prices[i] <= prices[i + 1]) {
                i++;
            }

            peak = prices[i];

            profit += peak - valley;
        }

        return profit;
    }
}