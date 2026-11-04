class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> u = new HashSet<Integer>();
        Arrays.stream(nums).forEach(e->u.add(e));
        int res=0;
        for(int n : u){
            if(!u.contains(n-1)){
                int seq =1;
                int num = n;
                while(u.contains(num+1)){
                    seq++;
                    num+=1;
                }
                res=Math.max(res, seq);
            }
        }
         return res;
    }
}