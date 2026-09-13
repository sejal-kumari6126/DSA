class Solution {
    public int maxFrequencyElements(int[] nums) {
        int hash[]=new int [101];
        for (int i=0;i<nums.length; i++){
                hash[nums[i]]++;
        }
        int maxfreq=0;
        for(int i=0;i<hash.length;i++){
            if(hash[i]>maxfreq)
            {
                maxfreq=Math.max(maxfreq,hash[i]);
                
            }
        }
        int ans=0;
        for(int i=0;i<hash.length;i++){
            if(hash[i]==maxfreq)
            ans+=maxfreq;
        }
        return ans;
    }
}