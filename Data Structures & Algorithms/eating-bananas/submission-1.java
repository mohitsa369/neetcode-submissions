class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left = 0;
        int right = Arrays.stream(piles).max().getAsInt();
        int res = right;
        while(left<=right){
            int m = (left+right)/2;
            long totalTime = 0;
            for(int p: piles){
                totalTime += Math.ceil((double)p/m);
            }
            if(totalTime <=h){
                res = m;
                right = m-1;
            }else{
                left = m+1;
            }
        }
        return res;
    }
}
