class Solution {
    public boolean isAnagram(String s, String t) {
        Hashtable<String, Integer> ht = new Hashtable<>();
        Hashtable<String, Integer> ht2 = new Hashtable<>();
        int ind1=0;
        int ind2=0;
        for(int i =0;i<s.length();i++){
            ht.put(s.substring(i,i+1),ht.merge(s.substring(i,i+1), 1, Integer::sum));
        }
        for(int i =0;i<t.length();i++){
            ht2.put(t.substring(i,i+1),ht2.merge(t.substring(i,i+1), 1, Integer::sum));
        }

        return ht.equals(ht2);
    }
}
