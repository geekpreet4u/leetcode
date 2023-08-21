class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set <Integer> nbr = new HashSet ();
        for(int i=0; i<nums.length;i++){
            if(nbr.contains(nums[i])){
                return true;
            }
            else
              nbr.add(nums[i]);


        }
        return false;
    }
}