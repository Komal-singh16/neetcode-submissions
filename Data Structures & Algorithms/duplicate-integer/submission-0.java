class Solution {
    public boolean hasDuplicate(int[] nums) {
       Hashtable<Integer,Integer> duplicate = new Hashtable<>();
       for(int i:nums){
        if(duplicate.containsKey(i))
            return true;
        else
            duplicate.put(i,1);
       }
       return false;
    }
}