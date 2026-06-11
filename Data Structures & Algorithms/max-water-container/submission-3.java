class Solution {
    public int maxArea(int[] heights) {
        int i=0, j = heights.length-1;
        int maxArea = 0; 
        while(i<j){
            int area = Math.min(heights[i], heights[j])*(j-i);
            maxArea = Math.max(area, maxArea);
            if(heights[i]>=heights[j]){
                j--;
            }else{
                i++;
            }
        }
        return maxArea;

        // brute (O(n2))
        // int maxArea = 0;
        // for(int i=0; i<heights.length; i++){
        //     int area = 0;
        //     for(int j=i+1; j<heights.length; j++){
        //         area = Math.min(heights[i], heights[j])*(j-i);
        //         maxArea = Math.max(area, maxArea);
        //     }
        // }
        // return maxArea;

    }
}
