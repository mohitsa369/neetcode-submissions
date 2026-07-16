class Solution {
    public int longestConsecutive(int[] nums) {
        int longestStreak = 0;
        HashSet<Integer> set = new HashSet<Integer>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        for(int num : set){
            if(!(set.contains(num-1))){
                int currentElement = num;
                int currentStreak = 1;

                while(set.contains(currentElement+1)){
                    currentElement +=1;
                    currentStreak +=1;
                }
              longestStreak =   Math.max(longestStreak, currentStreak);
            }
        }
        return longestStreak;
    }
}
