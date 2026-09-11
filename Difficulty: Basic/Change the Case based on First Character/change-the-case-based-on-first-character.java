class Solution {
    String modify(String s) {
        char first = s.charAt(0);
        if(Character.isLowerCase(first)){
           return s.toLowerCase(); 
        }else{
            return s.toUpperCase();
        }
        
    }
}