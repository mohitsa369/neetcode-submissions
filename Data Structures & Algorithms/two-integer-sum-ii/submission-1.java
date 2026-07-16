class Solution {
    public int[] twoSum(int[] nums, int target) {
        int left = -1;
        int right = -1;
        int n = nums.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(nums[i] + nums[j] == target && (i!=j) && (i<j)){
                left = i+1;
                right = j+1;
                return new int[]{left, right};
            }
            }
        }
        return new int[]{left, right};
    }
}
