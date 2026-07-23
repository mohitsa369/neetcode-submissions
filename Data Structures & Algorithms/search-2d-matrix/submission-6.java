public class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m =matrix.length;
        int n = matrix[0].length;

        int r=0, c = n-1;

        while(c>=0 && r<m){
            if(matrix[r][c] > target){
                c--;
            }else if(matrix[r][c] <target){
                r++;
            }else{
                return true;
            }
        }
        

        return false;
    }
}