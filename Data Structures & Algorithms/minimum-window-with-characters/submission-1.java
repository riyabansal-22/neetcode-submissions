class Solution {
    public String minWindow(String s, String t) {
        
        //brute ---> hashMap
        if(t.isEmpty()){
            return "";
        }
        Map<Character, Integer> countT = new HashMap<>();
        for(char c: t.toCharArray()){
            countT.put(c, countT.getOrDefault(c, 0)+1);
        }

        int[] res = {-1, -1};
        int resLen = Integer.MAX_VALUE;

        for(int i=0; i<s.length(); i++){
            Map<Character, Integer> countS = new HashMap<>();
            for(int j=i; j<s.length(); j++){
                countS.put(s.charAt(j), countS.getOrDefault(s.charAt(j), 0)+1);

                boolean flag = true;
                for(char c: countT.keySet()){
                    if(countS.getOrDefault(c, 0) < countT.get(c)){
                        flag = false;
                        break;
                    }
                }
                if(flag && j-i+1<resLen){
                    resLen = j-i+1;
                    res[0] = i;
                    res[1] = j;
                }
            }
        }
        return resLen == Integer.MAX_VALUE ? "" : s.substring(res[0], res[1]+1);




        //brute T.C-->O(N2*256)  hash array
        // int minLength = Integer.MAX_VALUE;
        // int startIndex = -1;

        // for(int i=0; i<s.length(); i++){
        //     int[] hash = new int[256];
        //     int count = 0;

        //     for(int j=0; j<t.length(); j++){
        //         hash[t.charAt(j)]++;
        //     }

        //     for(int j=i; j<s.length(); j++){
        //         if(hash[s.charAt(j)]>0){
        //             count++;
        //         }
        //         hash[s.charAt(j)]--;
        //         if(count==t.length()){
        //             if(j-i+1<minLength){
        //                 minLength = j-i+1;
        //                 startIndex = i;
        //             }
        //             break;
        //         }
        //     }
        // }
        // if(startIndex == -1){
        //     return "";
        // }
        // return s.substring(startIndex, startIndex+minLength);
    }
}
