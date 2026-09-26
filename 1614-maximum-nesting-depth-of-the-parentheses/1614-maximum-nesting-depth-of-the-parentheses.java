class Solution {
    public int maxDepth(String s) {
        int maxi=0,c=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                c++;
                maxi=Math.max(maxi,c);
            }
            else if(s.charAt(i)==')'){
                c--;
            }
        }
        return maxi;
    }
}