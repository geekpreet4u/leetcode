class Solution {
    public boolean isAnagram(String s, String t) {

        int[] count = new int[26];
        for (char C : s.toCharArray()){
            count[C-'a']++;
        }
        for (char C : t.toCharArray()){
            count[C-'a']--;
        }
       for(int i=0;i<count.length;i++){
           if(count[i]!=0){
               return false;
           }
           
       }
        return true;
    }
}