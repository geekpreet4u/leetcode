class Solution {
    public List<String> letterCombinations(String digits) {
        
        if(digits.length() ==0){
            return new ArrayList<>();
        }

        char[][] digittoChar ={
             {},{},{'a','b','c'},
             {'d','e','f'},
             {'g','h','i'},
             {'j','k','l'},
             {'m','n','o'},
             {'p','q','r','s'},
             {'t','u','v'},
             {'w','x','y','z'}

        };

        List<String> combos = new ArrayList();
append(digittoChar,combos, digits.toCharArray(),0,new StringBuilder());

return combos;



    }
private void append( char[][] digitToChar, List<String> combos, char[] digits,
int currentDigitPosition, StringBuilder currentString){

   if(currentDigitPosition == digits.length){
       combos.add(currentString.toString());
       return;
   }

char currentDigit  =digits[currentDigitPosition];
int currentDigitNum = Character.getNumericValue(currentDigit);

     char[] charsForDigit = digitToChar[currentDigitNum];

     for( char digitChar :charsForDigit ){
          append(digitToChar,combos, digits,
          currentDigitPosition+1,currentString.append(digitChar) );
          currentString.deleteCharAt(currentString.length() -1);

     }

}



}