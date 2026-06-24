class Solution {
    public int characterReplacement(String s, int k) {

        //BRUTE T.C-->O(n2), S.C-->O(26)
        int maxLength = 0;
        for(int i=0; i<s.length(); i++){
            int[] hash = new int[26];
            int maxF = 0;
            for(int j=i; j<s.length(); j++){
                hash[s.charAt(j)-'A']++;
                maxF = Math.max(maxF, hash[s.charAt(j)-'A']);
                int changes = (j-i+1) - maxF;
                if(changes<=k){
                    maxLength = Math.max(maxLength, j-i+1);
                }else{
                    break;
                }
            }
        }
        return maxLength;

        // int maxLength = 0;
        // for(int i=0; i<s.length(); i++){
        //     Map<Character, Integer> freq = new HashMap<>();
        //     int maxF = 0;
        //     for(int j=i; j<s.length(); j++){
        //         char ch = s.charAt(j);
        //         freq.put(ch, freq.getOrDefault(ch, 0)+1);
        //         maxF = Math.max(maxF, freq.getOrDefault(ch, 0));
        //         int changes = (j-i+1) - maxF;
        //         if(changes<=k){
        //             maxLength = Math.max(maxLength, j-i+1);
        //         }else{
        //             break;
        //         }
        //     }
        // }
        // return maxLength;
        
        // int l=0, res =0, count=0;
        // for(int r=0; r<s.length(); r++){

        //     if(s.charAt(r)!=s.charAt(l)){
        //         count++;
        //     }
        //     if(count>k){
                
        //     }
        // }
    }
}
