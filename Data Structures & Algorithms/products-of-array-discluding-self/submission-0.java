class Solution {
    public int[] productExceptSelf(int[] nums) {
        int i;int n=nums.length;
        int ans[]=new int[n];
        ans[0]=1;
        //for left part of array
        for(i=1;i<n;i++)
        {
                ans[i]=ans[i-1]*nums[i-1];
        }
        //for right part of array
        int right=1;
        for(i=n-1;i>=0;i--)
        {
            ans[i]=ans[i]*right;
            right=right*nums[i];
        }
        return ans;
    }
}  
