class Solution {
    public int maxProfit(int[] prices) {
        int i,j,s=0,max=0;
        for(i=0;i<prices.length-1;i++){
            if(prices[i]<prices[i+1]){
                s+=prices[i+1]-prices[i];
                
            }
        }
        return s;
    }
}
