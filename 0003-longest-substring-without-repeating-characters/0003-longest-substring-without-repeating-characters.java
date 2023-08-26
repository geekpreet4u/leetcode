class Solution {
    public int lengthOfLongestSubstring(String s) {
         int startPointer =0;
         int endPointer =0;
         int maxLen = Math.min(s.length(),1);
   HashSet<Character> aa = new HashSet();
         while( endPointer < s.length()){
             char c =s.charAt(endPointer);
             while(aa.contains(c)){
                 aa.remove(s.charAt(startPointer));
                 startPointer++ ;
             }
             aa.add(c);
             int windowSize = endPointer - startPointer + 1;
             maxLen = Math.max( maxLen, windowSize);
             endPointer++;
         }
      

        //abcab sliding window o(n)

        return maxLen;
        
    }
}