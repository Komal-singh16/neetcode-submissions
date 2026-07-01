class Solution {
    public int longestConsecutive(int[] nums) {
        int res=0;
        Set<Integer> set=new HashSet<>();
        for(int i:nums){
            set.add(i);
        }
        for(int i:nums){
            int streak=0, curr=i;
            while(set.contains(curr)){
                streak++;
                curr++;
            }
        res=Math.max(res,streak);
        }
        return res;
    }
}
