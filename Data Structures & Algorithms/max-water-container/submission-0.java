class Solution {
    public int maxArea(int[] heights) {
        int l=0; int r=heights.length-1;
        int i;int p=0;int max=0;int s=0,m;
        while(l<r)
        {
            p=Math.min(heights[l],heights[r]);
            s=r-l;
            m=s*p;
            max=Math.max(max,m);
            if(heights[l]<heights[r]){
                l++;
            }
            else
            {
                r--;
            }
        }
        return max;
    }
}
