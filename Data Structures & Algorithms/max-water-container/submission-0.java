class Solution {
    public int maxArea(int[] heights) {
        int l =0, r = heights.length-1;
        int max = Math.min(heights[l],heights[r])*(r-l);
        while(l<r){
            if(max<Math.min(heights[l],heights[r-1])*(r-l-1)){
                max = Math.min(heights[l],heights[r-1])*(r-l-1);
                r--;
            }else if(max<Math.min(heights[l+1],heights[r])*(r-l-1)){
                max = Math.min(heights[l+1],heights[r])*(r-l-1);
                l++;
            }else{
                if(heights[r]<heights[l]) r--;
                else l++;
            }
        }return max;
    }
}
