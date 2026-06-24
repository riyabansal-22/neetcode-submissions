class Solution {
    public boolean checkInclusion(String s1, String s2) {
        char[] s1arr = s1.toCharArray();
        Arrays.sort(s1arr);
        String string1 = new String(s1arr);

        for(int i=0; i<s2.length(); i++){
            for(int j=i; j<s2.length(); j++){
                char[] substrArr = s2.substring(i,j+1).toCharArray();
                Arrays.sort(substrArr);
                String string2 = new String(substrArr);
                if(string2.equals(string1)){
                    return true;
                }
            }
        }
        return false;
    }
}
