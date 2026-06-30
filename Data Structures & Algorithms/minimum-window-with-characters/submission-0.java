class Solution {
    public String minWindow(String s, String t) {
        int minLength = Integer.MAX_VALUE;
        int startIndex = -1;

        for(int i=0; i<s.length(); i++){
            int[] hash = new int[256];
            int count = 0;

            for(int j=0; j<t.length(); j++){
                hash[t.charAt(j)]++;
            }

            for(int j=i; j<s.length(); j++){
                if(hash[s.charAt(j)]>0){
                    count++;
                }
                hash[s.charAt(j)]--;
                if(count==t.length()){
                    if(j-i+1<minLength){
                        minLength = j-i+1;
                        startIndex = i;
                    }
                    break;
                }
            }
        }
        if(startIndex == -1){
            return "";
        }
        return s.substring(startIndex, startIndex+minLength);
    }
}
