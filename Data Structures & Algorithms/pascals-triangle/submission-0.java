class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> out = new ArrayList<>();
        for(int i = 0;i<numRows;i++){
            List<Integer> in = new ArrayList<>();
            if(i!=0)in.add(1);
            
            for(int j =1;j<i;j++){
                in.add(out.get(i-1).get(j-1)+out.get(i-1).get(j));
            }
            in.add(1);
            out.add(in);
        }return out;
        
    }
}