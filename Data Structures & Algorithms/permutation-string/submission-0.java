class Solution {
    public boolean checkInclusion(String s1, String s2) {
        char[] c = s1.toCharArray();
        Arrays.sort(c);
        String sortedOne = new String(c);

        for(int i=0;i<s2.length();i++){
            for(int j=i;j<s2.length();j++){
                char[] subStr = s2.substring(i, j+1).toCharArray();
                Arrays.sort(subStr);
                String sortedTwo = new String(subStr);
                if(sortedOne.equals(sortedTwo)){
                    return true;
                }
            }
        }
        return false;
    }
}
