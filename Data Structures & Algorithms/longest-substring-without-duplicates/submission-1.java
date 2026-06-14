class Solution {
    public int lengthOfLongestSubstring(String s) {


        //brute  T.C--> O(n2), S.C-->O(1)
        // int maxLength = 0;
        // for(int i=0; i<s.length(); i++){
        //     int[] hash = new int[256];
        //     for(int j=i; j<s.length(); j++){
        //         if(hash[s.charAt(j)]==1)  break;
        //         int len = j-i+1;
        //         maxLength = Math.max(len, maxLength);
        //         hash[s.charAt(j)] = 1;
        //     }
        // }
        int maxLength = 0;
        for(int i=0; i<s.length(); i++){
            Set<Character> charSet = new HashSet<>();
            for(int j=i; j<s.length(); j++){
                if(charSet.contains(s.charAt(j))) break;

                charSet.add(s.charAt(j));
            }
            maxLength = Math.max(maxLength, charSet.size());
        }

            // int hash[] = new int[256];
            // hash = {-1};
            // int l=0, r=0, maxLength = 0;
            // while(r < s.length()){
            //     if(!hash[s.charAt(r)] != -1){
            //         if(hash[s.charAt(r)] >= l ){
            //             l = hash[s.charAt(r)]+1;
            //         }
            //     }
            //     maxLength = Math.max(maxLength, r-l+1);

            //     hash[s.charAt(r)] = r;
            //     r++;
            // }
        
        return maxLength;
    }
}
