class Solution {
    public int[] topKFrequent(int[] nums, int k) {
       int i;int n=nums.length;
      HashMap<Integer,Integer> map=new HashMap<>();
      for(int num:nums)
      {
        map.put(num,map.getOrDefault(num,0)+1);
      }
      PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)->map.get(b)-map.get(a));
      pq.addAll(map.keySet());
      int[] ans=new int[k];
      for(i=0;i<k;i++)
      {
        ans[i]=pq.poll();
      }
      return ans;
    }
}

