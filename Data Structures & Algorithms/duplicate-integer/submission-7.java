class Solution {
    public boolean hasDuplicate(int[] nums) {
        boolean flag = false;
        int n = nums.length;
        HashMap<Integer, Boolean> map = new HashMap<>();
        for(int i=0;i<n;i++){
            if(map.containsKey(nums[i])){
                return true;
            }
            map.put(nums[i], false);
        }
        return flag;
    }
}