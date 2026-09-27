class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        HashSet<Character> set = new HashSet<>();
        int count = 0;
        for(int i =0;i<allowed.length();i++){
            set.add(allowed.charAt(i));
        }
        for(int i= 0;i<words.length;i++){
            count++;
            char[] list = words[i].toCharArray();
            for(int j=0;j<list.length;j++){
                if(!set.contains(list[j])){
                    count--;
                    break;
                }
            }
        }return count;
    }
}