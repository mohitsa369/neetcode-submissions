class Solution {
    public int longestConsecutive(int[] nums) {
        int longestStreak = 0;
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums){
            set.add(num);
        }

        for(int num: nums){
            if(!set.contains(num-1)){
                int length = 1;
                while(set.contains(num+length)){
                    length++;
                }
                longestStreak = Math.max(longestStreak, length);
            }
        }
        return longestStreak;
}
}
