class Solution {
    public void nextPermutation(int[] nums) {
        int index=-1;
        int temp=0;
        for(int i=nums.length-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                index=i;
                break;
            }
        }
        if(index==-1){
            reverse(nums,0,nums.length-1);
            return;
            }
        
        for(int i=nums.length-1;i>=index;i--){
            if(nums[i]>nums[index]){
                temp=nums[i];
                nums[i]=nums[index];
                nums[index]=temp;
                break;
            }
        }
        reverse(nums,index+1,nums.length-1);
    }
    public static void reverse(int nums[],int left , int right){
        while(left<right){
            int t=nums[left];
            nums[left]=nums[right];
            nums[right]=t;
            left++;
            right--;
        }
    }
}
