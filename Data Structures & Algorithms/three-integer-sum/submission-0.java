class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int i,j,k;int s=0;
        int n=nums.length;
       List<List<Integer>> ans=new ArrayList<>();
        Arrays.sort(nums);
        for(i=0;i<n-2;i++)
        {
            if(i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int l=i+1;int r=n-1;
            while(l<r)
            {  s=nums[i]+nums[l]+nums[r];
                if(s>0)
                {
                    r--;
                }
                else if(s<0)
                {
                    l++;
                }
                else
                {
                    ans.add(Arrays.asList(nums[i],nums[l],nums[r]));
                    l++;r--;
                    while((l<r) && (nums[l]==nums[l-1]))
                    {l++;}
                    while(l<r && nums[r]==nums[r+1])
                    {
                        r--;
                    }
                }
            }
        }
        return ans;
        
    }
}
