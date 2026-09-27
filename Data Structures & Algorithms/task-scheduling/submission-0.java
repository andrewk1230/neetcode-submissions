class Solution {
    public int leastInterval(char[] tasks, int n) {
        HashMap<Character, Integer> map = new HashMap<>();
        int maxFreq = 0;
        for(int i =0;i<tasks.length;i++){
            map.put(tasks[i], map.getOrDefault(tasks[i], 0)+1);
            maxFreq = Math.max(maxFreq, map.get(tasks[i]));
        }
        int maxCount = 0;
        for(int freq: map.values()){
            if(freq == maxFreq) maxCount++;
        }
        int cycles = (maxFreq-1) * (n+1) +maxCount;
        return Math.max(tasks.length,cycles);

    }
}
