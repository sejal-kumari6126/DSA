class Solution {
    public boolean isPalindrome(String s) {
        s=s.trim();
        s=s.toLowerCase();
        String rev="",st="";
        for(int i=0;i<s.length();i++){
            if(Character.isLetter(s.charAt(i)) || Character.isDigit(s.charAt(i))){
            st+=s.charAt(i);
            rev=s.charAt(i)+rev;
            }
        }
        if(!st.equals(rev))
        return false;
        else 
        return true;
    }
}