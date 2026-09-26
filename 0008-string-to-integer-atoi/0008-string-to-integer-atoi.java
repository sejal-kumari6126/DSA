class Solution {
    public int myAtoi(String s) {
        int num=0,digit=0;
        int sign=1;
        s=s.trim();
        int i=0;
        if(s.length()==0)
        return 0;
        
        if(s.charAt(i)=='-'){
            sign=-1;
            i++;}
        else if(s.charAt(i)=='+')
        i++;
        for(;i<s.length();i++){
            if(Character.isDigit(s.charAt(i)))
            digit=s.charAt(i)-'0';
            else
            break;
            if(num>((Integer.MAX_VALUE)-digit)/10){
                return (sign==1)?Integer.MAX_VALUE:Integer.MIN_VALUE;

            }
            num=num*10+digit;
        }
        return num*sign;
    }
}