class Solution {
    public int maxProfit(int[] prices) {
        int minBuy=prices[0];
	int maxProfit =0;
	for (int sell:prices){
		int profit = sell-minBuy;
		maxProfit=Math.max(profit,maxProfit);
		minBuy=Math.min(sell,minBuy);
	}
	return maxProfit;
    }
}
