class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length() ==0) return 0;
        if(s.length() ==1) return 1;
        
        HashMap<Character, Integer> map = new HashMap<>();
        int max = 0;
        int l = 0;
        for(int r= 0;r<s.length();r++){
            if(map.containsKey(s.charAt(r))){
                l = Math.max(l,map.get(s.charAt(r))+1);
            }
            map.put(s.charAt(r), r);
            max = Math.max(max, r-l+1);
        }return max;
    }
}
