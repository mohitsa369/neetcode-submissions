class Solution {
    public int maxArea(int[] nums) {
       int n = nums.length;
       int maxArea = 0;
       for(int i=0;i<n;i++){
        int min = 0, area =0, width = 0;
        for(int j=i+1;j<n;j++){
            min = Math.min(nums[i], nums[j]);
            width = j-i;
            area = min * width;
            if(area > maxArea){
                maxArea = area;
            }
        }
        maxArea = Math.max(maxArea,area);
       } 
        return maxArea;
    }
}
