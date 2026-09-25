class Solution {
    public String removeOuterParentheses(String s) {
        String ans="";
        int counter=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                if(counter>0)
                ans+=s.charAt(i);
                counter++;
            }
            else{
                counter--;
                if(counter>0)
                ans+=s.charAt(i);
            }
        }
        return ans;
    }
}