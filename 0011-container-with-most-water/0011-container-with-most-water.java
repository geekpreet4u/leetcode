class Solution {
    public int maxArea(int[] height) {

        int leftPointer = 0;
        int  rightPointer = height.length -1;
        int maxWater =0;

        while (leftPointer < rightPointer ){
             
             int minHeight = Math.min( height[leftPointer], height[rightPointer]);
             int width = rightPointer-leftPointer;
             int water = minHeight * width;
             maxWater = Math.max( maxWater, water);
            if( height[leftPointer] < height[rightPointer]){
                leftPointer++;
             }
            else{
             rightPointer--;
             }
            
           
            }
       
        return maxWater;
        
    }
}