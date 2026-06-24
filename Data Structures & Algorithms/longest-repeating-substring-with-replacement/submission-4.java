class Solution {
    public int characterReplacement(String s, int k) {

        //better T.C-> O(n)+O(n)*26 =O(2n), S.C->o(26) 
        int l=0, maxF=0;
        int[] hash = new int[26];
        int maxLength = 0;
        for(int r=0; r<s.length(); r++){
            hash[s.charAt(r)-'A']++;
            maxF = Math.max(maxF, hash[s.charAt(r)-'A']);

            while((r-l+1) - maxF > k){
                hash[s.charAt(l)-'A']--;
                maxF = 0;
                for(int i=0; i<26; i++){
                    maxF = Math.max(maxF, hash[i]);
                }
                l++;
            }
            if((r-l+1)-maxF <=k){
                maxLength = Math.max(maxLength, r-l+1);
            }
        }
        return maxLength;













        // int l=0, maxF = 0;
        // int maxLength = 0;
        // Map<Character, Integer> freq = new HashMap<>();
        // for(int r=0; r<s.length(); r++){
        //     char ch = s.charAt(r);
        //     freq.put(ch, freq.getOrDefault(ch, 0)+1);
        //     maxF = Math.max(maxF, freq.getOrDefault(ch, 0));
           
            
        //         while((r-l+1) - maxF>k){
        //             freq.put(s.charAt(l), freq.get(s.charAt(l)) -1);
        //             if(freq.get(s.charAt(l)) == 0){
        //                 freq.remove(s.charAt(l));
        //             }
        //             l++;
        //         }
            
        //     maxLength = Math.max(maxLength, r-l+1);
        // }
        // return maxLength;

        //BRUTE T.C-->O(n2), S.C-->O(26)
        // int maxLength = 0;
        // for(int i=0; i<s.length(); i++){
        //     int[] hash = new int[26];
        //     int maxF = 0;
        //     for(int j=i; j<s.length(); j++){
        //         hash[s.charAt(j)-'A']++;
        //         maxF = Math.max(maxF, hash[s.charAt(j)-'A']);
        //         int changes = (j-i+1) - maxF;
        //         if(changes<=k){
        //             maxLength = Math.max(maxLength, j-i+1);
        //         }else{
        //             break;
        //         }
        //     }
        // }
        // return maxLength;

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
        
       
    }
}
