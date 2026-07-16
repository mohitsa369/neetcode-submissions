class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int n= prices.length;
        int left = 0;
        int right = 1;
        while(right < n){ 
            if(prices[left] < prices[right]){
                int p = prices[right] - prices[left];
                maxProfit = Math.max(maxProfit, p);
            }
            else {
                left =right;
            }
            right++;
        }
        return maxProfit;
    }
}
