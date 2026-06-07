class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l=0;int r=1;int i, ma=0,c=0;
        int n=s.length();
        HashSet<Character> set=new HashSet<>();
        for(i=0;i<n;i++)
        {
            while(set.contains(s.charAt(i)))
            {
                set.remove(s.charAt(l));
                l++;
            }
            set.add(s.charAt(i));
            ma=Math.max(ma,i-l+1);
        }        
return  ma;
    }
}
