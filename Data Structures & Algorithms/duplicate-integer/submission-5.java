class Solution {
    public boolean hasDuplicate(int[] nums) {
        boolean flag = false;
        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            if(map.containsValue(nums[i])){
                return true;
            }
            map.put(i,nums[i]);
        }
        return flag;
    }
}