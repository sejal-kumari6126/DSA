class Solution {
    public List<String> generateParenthesis(int n) {
        ArrayList<String> ans = new ArrayList<>();
        generate("",0,0,n,ans);
        return ans;
    }
    public void generate(String s, int open , int closed, int n , List<String> ans){
        //Base case
        if(s.length()==2*n){
        ans.add(s);
        return ;
        }

         //processing 
         //add '(' and ')'
        if(open<n)
        generate(s+'(',open+1,closed,n,ans);
        if(closed<open)
        generate(s+')',open,closed+1,n,ans);
    }
}