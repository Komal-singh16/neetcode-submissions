class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length())
        return false;

        HashMap<Character,Integer> set1=new HashMap<>();
        HashMap<Character,Integer> set2=new HashMap<>();
        for(char i:s.toCharArray()){
            set1.put(i, set1.getOrDefault(i,0)+1);
        }
        for(char j:t.toCharArray()){
            set2.put(j, set2.getOrDefault(j,0)+1);
        }
        
    if(set1.equals(set2))
        return true;
    else
        return false;
    }
} 
