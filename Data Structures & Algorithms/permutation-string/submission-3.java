class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length() > s2.length()){
            return false;
        }
        char[] s1Arr = s1.toCharArray();
        Arrays.sort(s1Arr);

        String sortedS1 = new String(s1Arr);

        for(int i=0;i<s2.length();i++){
            for(int j=i;j<s2.length();j++){
                char[] subStr = s2.substring(i, j+1).toCharArray();
                Arrays.sort(subStr);
                String sortedS2 = new String(subStr);

                if(sortedS2.equals(sortedS1)){
                    return true;
                }
            }
        }

        

        
    return false;
    }
}
