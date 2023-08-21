/*
This coding puzzle is to evaluate whether the given parenthesis are valid or not
In other words open brackets must be closed by the same type of brackets.

*/

class Solution {
    public boolean isValid(String s) {
     // Use a stack for push and pop
     // Use a hashmap to maintain Key and Values
     // Case s = "()[]{}" Positive Case it will return true
     // Case s = "(}{})" Negative Case it will return false

     Stack <Character> brackets = new Stack<> ();
     Map <Character, Character> bracketsMap = new HashMap <>(3); // 3 becaue they only have three bracs in the question.
        bracketsMap.put(']', '[');
         bracketsMap.put(')', '(');
          bracketsMap.put('}', '{');


     for ( int i=0; i< s.length(); i++) {
           char a = s.charAt(i); // scan all characters in the string provided.
            if ( bracketsMap.containsKey(a)){
                if(!brackets.isEmpty() && bracketsMap.get(a).equals(brackets.peek()) ){
                    brackets.pop();
                }
                else{
                    return false;
                }
            }
            else {
                brackets.push(a);
            }


            

     }
      return brackets.isEmpty();
    }

}