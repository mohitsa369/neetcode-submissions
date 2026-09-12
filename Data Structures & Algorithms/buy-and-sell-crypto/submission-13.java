class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int n= prices.length;
        for(int i=0;i<n;i++){
            int profit = 0;
            for(int j=i;j<n;j++){
                if(prices[j]> prices[i]){
                    profit = prices[j] - prices[i];
                    maxProfit = Math.max(maxProfit, profit);
                }
            }
        }

        return maxProfit;
        
    }
}
