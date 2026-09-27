class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> count = new ArrayList<>();
        int top = 0 , left =0;
        int bottom = matrix.length, right = matrix[0].length;
        while(left<right && top<bottom){
            for(int i =left;i<right;i++){
                count.add(matrix[top][i]);
            }
            top++;
            for(int i=top;i<bottom;i++){
                count.add(matrix[i][right-1]);
            }
            right--;

            if (!(left < right && top < bottom)) {
                break;
            }
            for(int i = right-1;i>=left;i--){
                count.add(matrix[bottom-1][i]);
            }
            bottom--;
            for(int i = bottom-1;i>=top;i--){
                count.add(matrix[i][left]);
            }
            left++;
        }return count;
    }
}
