class Solution {
    public int[] twoSum(int[] nums, int target) {

        HashMap <Integer,Integer> storeCrap = new HashMap();



        for(int i=0; i <nums.length;i++){
            int addend = target - nums[i];
             if(storeCrap.containsKey(addend)){
                 return new int[]{storeCrap.get(addend),i };
             }
             else{
                 storeCrap.put(nums[i],i);
             }

          
        }
        return null;
    }
}