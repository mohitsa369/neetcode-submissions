class Solution {
    public int[] twoSum(int[] nums, int target) {
        int l =0, r =0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int complement = target - nums[i];
            if(map.containsKey(complement)){
                l = map.get(complement);
                r = i;
            }
            map.put(nums[i], i);
        }
        return new int[]{l , r};  
}
}
