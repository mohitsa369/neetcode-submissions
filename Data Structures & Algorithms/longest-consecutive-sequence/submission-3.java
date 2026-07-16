class Solution {
    public int longestConsecutive(int[] nums) {
        int longestStreak = 0;
        HashSet<Integer> elements = new HashSet<Integer>();
        for(int num : nums){
            elements.add(num);
        }
        for(int num : elements){
            if(!(elements.contains(num -1))){
                int currentElement = num;
                int currentStreak = 1;
                while((elements.contains(currentElement + 1))){
                    currentElement += 1;
                    currentStreak += 1;
                }
                longestStreak = Math.max(longestStreak, currentStreak);
            }
        }
        return longestStreak;
    }
}
