class Solution {
    public int[] twoSum(int[] arr, int target) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i=0;i<arr.length;i++){
            int c = target - arr[i];
            if(map.containsKey(c)){
                return new int[]{map.get(c), i};
            }
            map.put(arr[i],i);
        }
        return new int[0];

}
}
