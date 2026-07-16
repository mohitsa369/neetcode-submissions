class Solution {
    public boolean hasDuplicate(int[] nums) {
        boolean flag = false;
        int n = nums.length;
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<n;i++){
            if(set.contains(nums[i])){
                return true;
            }
            set.add(nums[i]);
        }
        return flag;
    }
}