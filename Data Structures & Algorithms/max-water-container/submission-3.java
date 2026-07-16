class Solution {
    public int maxArea(int[] heights) {
       int n = heights.length;
       int maxArea = 0;
       int left = 0 , right = n-1;
       while(left < right){
        int area =0, min = 0;
        if(heights[left] < heights[right]){
            min = heights[left];
            area = (right-left) * min;
            left++;
        }else{
            min = heights[right];
            area = (right-left) * min;
            right--;
        }
        if(area > maxArea){
            maxArea = Math.max(maxArea,area);
        }
       }
        return maxArea;
    }
}
