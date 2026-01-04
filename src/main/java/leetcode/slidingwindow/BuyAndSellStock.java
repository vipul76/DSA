package leetcode.slidingwindow;

public class BuyAndSellStock {
    static void main() {
        int[] prices = {7,1,5,3,6,4};
        int result = maxProfit(prices);
        System.out.println(result);
    }

    private static int maxProfit(int[] prices) {
        return 0;
    }

    private static int maxProfitBF(int[] prices) {
        int maxProfit = 0;
        for(int i=0;i<prices.length;i++){
            for(int j=i+1;j<prices.length;j++){
                if(prices[j]-prices[i]>0){
                    maxProfit = Integer.max(maxProfit,prices[j]-prices[i]);
                }
            }
        }
        return maxProfit;
    }

}
