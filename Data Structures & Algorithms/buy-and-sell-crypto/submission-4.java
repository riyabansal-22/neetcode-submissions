class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0, minPrice=Integer.MAX_VALUE;
        for(int price : prices){
            minPrice = Math.min(price, minPrice);
            maxProfit = Math.max(maxProfit, price-minPrice);
        }
        return maxProfit;
        
        // int i=0, j=1;
        // int maxP= 0;
        // while(j<prices.length){
        //     if(prices[i]<prices[j]){
        //         maxP = Math.max(maxP, prices[j]-prices[i]);
        //     }else{
        //         i = j;
        //     }
        //     j++;
        // }
        // return maxP;
        // int maxProfit = 0;
        // for(int i=0; i<prices.length; i++){
        //     int profit = 0;
        //     for(int j=i; j<prices.length; j++){
        //         profit = prices[j] - prices[i];
        //         maxProfit = Math.max(maxProfit, profit);
        //     }
        // }
        // return maxProfit;
    }
}
