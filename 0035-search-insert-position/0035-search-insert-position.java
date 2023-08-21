/*
This leet code is to solve search insert position and return the index of the target value


*/

class Solution {
    public int searchInsert(int[] nums, int target) {
        /* user binary search algo */
        int mid =0;
        if ( target < nums[0]){
            return 0;
        }
        int right = nums.length -1;
        int left = 0;

        while ( left <=  right  ){
          mid = ( left + right)/2;
          if ( nums[mid] < target){
              left = mid +1;
             

          }
          else if (nums[mid]  > target){
              right = mid -1;
              
          }
          else
          return mid;

        }
        return left;
    }
}