class Solution {
    public int[] productExceptSelf(int[] nums) {
        int total = 1;
        int none = 1;
        int zc = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0){
                zc++;
            }
            if(nums[i] != 0){
                none *= nums[i];
            } 
            total *= nums[i];
        }
        int[] ret = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            if(zc >= 2) ret[i] = 0;
            else if(nums[i] == 0) {
                ret[i] = none;
            } else if (zc == 1) {
                ret[i] = 0;
            } else ret[i] = total / nums[i];
        }
        return ret;
    }
}