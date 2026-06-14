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
        // int maxLength = 0;
        // for(int i=0; i<s.length(); i++){
        //     Set<Character> charSet = new HashSet<>();
        //     for(int j=i; j<s.length(); j++){
        //         if(charSet.contains(s.charAt(j))) break;

        //         charSet.add(s.charAt(j));
        //     }
        //     maxLength = Math.max(maxLength, charSet.size());
        // }
        // return maxLength;


        Map<Character, Integer> map = new HashMap<>();
        int l=0, res = 0;
        for(int r=0; r<s.length(); r++){
            if(map.containsKey(s.charAt(r))){
                l = Math.max(map.get(s.charAt(r))+1, l);
            }
            map.put(s.charAt(r), r);
            res = Math.max(res, r-l+1);
        }
        return res;
     
    }
}
