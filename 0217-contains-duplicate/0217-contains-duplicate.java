class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap <Integer,Integer> nbr = new HashMap ();
        for(int i=0; i<nums.length;i++){
            if(nbr.containsKey(nums[i])){
                return true;
            }
            else
              nbr.put(nums[i],i);


        }
        return false;
    }
}