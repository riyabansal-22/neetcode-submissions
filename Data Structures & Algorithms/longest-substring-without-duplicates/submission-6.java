class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxLength=0;
        for(int i=0; i<s.length(); i++){
            Set<Character> charSet = new HashSet<>();
            for(int j=i; j<s.length(); j++){
                if(charSet.contains(s.charAt(j))){
                    break;
                }
                charSet.add(s.charAt(j));
            }
            maxLength = Math.max(maxLength, charSet.size());
        }
        return maxLength;
        












        //optimal
        // Map<Character, Integer> map = new HashMap<>();
        // int l=0;
        // int res = 0;
        // for(int r=0; r<s.length(); r++){

        //     if(map.containsKey(s.charAt(r))){
        //         l = Math.max(l, map.get(s.charAt(r))+1);
        //     }

        //     map.put(s.charAt(r), r);
        //     res = Math.max(r-l+1, res);
        // }
        // return res;


        //better
        // HashSet<Character> set = new HashSet<>();
        // int l=0, res = 0;
        // for(int r=0; r<s.length(); r++){
        //     while(set.contains(s.charAt(r))){
        //         set.remove(s.charAt(l));
        //         l++;
        //     }
        //     set.add(s.charAt(r));
        //     res = Math.max(res, r-l+1);
        // }
        // return res;

        //brute
        // int res = 0;
        // for(int i=0; i<s.length(); i++){
        //     Set<Character> charSet = new HashSet<>();
        //     for(int j=i; j<s.length(); j++){
        //         if(charSet.contains(s.charAt(j))){
        //             break;
        //         }
        //         charSet.add(s.charAt(j));
        //     }
        //     res = Math.max(res, charSet.size());
        // }
        // return res;
    }
}
