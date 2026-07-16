class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        int l = 0;
        int r = n-1;
        while(l < r){
            int curSum = nums[l] +  nums[r];
            if(curSum == target){
                return new int[] {l+1, r+1};
            }else if(curSum > target){
                r--;
            }else{
                l++;
            }
        }


    return new int[0];
    }
}
