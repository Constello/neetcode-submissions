class Solution {
    public int maxProfit(int[] prices) {
        int i;int l=0;int r=1;
        int n=prices.length-1;
        int max=0;
        for(i=0;i<=n-1;i++)
        {
            if(prices[r]<=prices[l])
            {
                l=r;r++;
            }
            else
            {
                int d=prices[r]-prices[l];
                max=Math.max(max,d);r++;
            }
        }
        return max;
    }
}
