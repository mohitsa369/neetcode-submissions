public class Solution {
    public boolean isPalindrome(String s) {
        String newStr = s.replaceAll("[^a-zA-Z0-9]", "");
        int l = 0, r = newStr.length() - 1;
        while (l < r) {
            if(Character.toLowerCase(newStr.charAt(l)) != 
            Character.toLowerCase(newStr.charAt(r))){
                return false;
            }
            
            l++; r--;
        }
        return true;
    }

    public boolean alphaNum(char c) {
        return (c >= 'A' && c <= 'Z' ||
                c >= 'a' && c <= 'z' ||
                c >= '0' && c <= '9');
    }
}