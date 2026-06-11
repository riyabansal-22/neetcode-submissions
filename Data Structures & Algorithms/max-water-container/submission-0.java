class Solution {
    public int maxArea(int[] heights) {
        int maxArea = 0;
        for(int i=0; i<heights.length; i++){
            int area = 0;
            for(int j=i+1; j<heights.length; j++){
                area = Math.min(heights[i], heights[j])*(j-i);
                maxArea = Math.max(area, maxArea);
            }
        }
        return maxArea;
        // int i=0, j=i+1;
        // int maxArea = 1;
        // while(j<heights.length){
        //     int area = 1;
        //     if(heights[i]<heights[j]){
        //         area = heights[i]*(heights[j]-heights[i]);
        //     }else{
        //         area = heights[j]*(heights[i]-heights[j]);
        //     }

        //     maxArea = Math.max(area, maxArea);
        //     i++;
        //     j++;
        // }
        // return maxArea;
    }
}
