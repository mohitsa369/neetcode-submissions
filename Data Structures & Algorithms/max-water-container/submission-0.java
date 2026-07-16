class Solution {
    public int maxArea(int[] heights) {
       int maxheight = 0;
        for(int i=0;i<heights.length;i++){
            int height = 0;
            int min = 0;
            for(int j=i+1;j<heights.length;j++){
                if(heights[i] < heights[j]){
                    min = heights[i];
                }else{
                    min = heights[j];
                }
                height = (j-i) * min;
                if(height > maxheight) {
                    maxheight = Math.max(maxheight, height);
                }
            }
        }
        return maxheight;
    }
}
