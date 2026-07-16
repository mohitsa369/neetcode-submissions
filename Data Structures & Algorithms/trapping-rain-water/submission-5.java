class Solution {
    public int trap(int[] height) {
        int n  = height.length;
        if(height == null ||  n==0){
            return 0;
        }
        int result =0;
        int left = 0;
        int right = n-1;
        int leftMax = height[left];
        int rightMax= height[right];
        while(left < right){
            if(leftMax < rightMax){
                left++;
                leftMax = Math.max(leftMax, height[left]);
                result += leftMax - height[left];

            }else{
                right--;
                rightMax  = Math.max(rightMax, height[right]);
                result+= rightMax - height[right];
            }
            
        }
        return result;
    }
}
