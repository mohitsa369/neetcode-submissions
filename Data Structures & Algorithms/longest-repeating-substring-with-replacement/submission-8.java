class Solution {
    public int characterReplacement(String s, int k) {
    HashMap<Character, Integer> map = new HashMap<>();
    int res = 0, l=0, maxF =0;
    for(int i=0;i<s.length();i++){
        char c = s.charAt(i);
        map.put(c, map.getOrDefault(c, 0)+1);
        maxF = Math.max(maxF, map.get(c));

        while((i-l+1) - maxF > k){
            map.put(s.charAt(l), map.get(s.charAt(l)) - 1);
            l++;
        }
        res = Math.max(res, i-l+1);
    } 
        return res;
    }
}
