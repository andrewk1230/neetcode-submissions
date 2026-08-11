class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int mlow = 0;
        int mhigh = matrix.length - 1;
        int lastCol = matrix[0].length - 1;

        while (mlow <= mhigh) {
            int mmid = mlow + (mhigh - mlow) / 2;
            int first = matrix[mmid][0];
            int last = matrix[mmid][lastCol];

            if (target >= first && target <= last) {
                return secMat(matrix[mmid], target);
            } else if (target < first) {
                mhigh = mmid - 1;
            } else { // target > last
                mlow = mmid + 1;
            }
        }
        return false;
    }

    private boolean secMat(int[] row, int target) {
        int low = 0, high = row.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (row[mid] == target) return true;
            else if (row[mid] < target) low = mid + 1;
            else high = mid - 1;
        }
        return false;
    }
}