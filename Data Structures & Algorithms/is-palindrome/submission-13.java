public class Solution {
    public boolean isPalindrome(String s) {
        int front = 0;
        int last = s.length()-1;
        while(front < last){
            while(front < last && !alphaNum(s.charAt(front))){
                front++;
            }
            while(last >front && !alphaNum(s.charAt(last))){
                last--;
            }
            if(Character.toLowerCase(s.charAt(front))!= 
            Character.toLowerCase(s.charAt(last))){
                return false;
            }
            front ++;
            last--;
        }
        return true;
    }

    public boolean alphaNum(char c) {
        return (c >= 'A' && c <= 'Z' ||
                c >= 'a' && c <= 'z' ||
                c >= '0' && c <= '9');
    }
}