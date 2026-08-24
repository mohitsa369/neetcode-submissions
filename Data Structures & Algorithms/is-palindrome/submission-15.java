class Solution {
    public boolean isPalindrome(String s) {
        String s1 = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int front = 0;
        int last = s1.length()-1;
        while(front < last){
            if(s1.charAt(front)!=s1.charAt(last)){
                return false;
            }
            front++; last--;
        }
        return true;
        
    }
}
