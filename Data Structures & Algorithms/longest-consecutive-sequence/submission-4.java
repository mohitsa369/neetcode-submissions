class Solution {
    public int longestConsecutive(int[] nums) {
        int longestStreak = 0;
        int currentStreak  = 0;
        HashSet<Integer> set = new HashSet<Integer>();
        for(int num :  nums){
            set.add(num);
        }

        for(int num : nums){
            if(!(set.contains(num -1))){
                int currentElement = num;
                currentStreak = 1;
                while(set.contains(currentElement+1)){
                    currentElement+=1;
                    currentStreak+=1;
                }
                longestStreak = Math.max(longestStreak, currentStreak);
            }
        }

        return longestStreak;
}
}
