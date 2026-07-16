class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int n= prices.length;
        int left = 0;
        int right = 1;
        while(right < n){
            int profit = 0;
            if(prices[left] < prices[right]){
            profit = prices[right] - prices[left]; 
            if(profit > maxProfit){
                maxProfit = Math.max(maxProfit, profit);
            }
            }else{
                left = right;
            }
            right++;
        }
        return maxProfit;
    }
}
