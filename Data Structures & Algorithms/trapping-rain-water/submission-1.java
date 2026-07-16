class Solution {
    public int trap(int[] height) {
        int n  = height.length;
        if(height == null ||  n==0){
            return 0;
        }
        int res =0;
        int left = 0,  right = n-1;
        int leftMax = height[left], rightMax = height[right];
        while(left < right){
            if(leftMax < rightMax){
                left++;
                leftMax = Math.max(leftMax, height[left]);
                res+= leftMax - height[left];
            }else{
                right--;
                rightMax = Math.max(rightMax, height[right]);
                res+= rightMax -height[right];
            }
        }
        return res;
    }
}
