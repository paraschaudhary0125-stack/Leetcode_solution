class Solution {
    public int searchInsert(int[] nums, int target) {
        int n=nums.length;
        int a=0;
        for(int i=0;i<n;i++){
            if(target==nums[i]){
                a=i;
                break;
            }
            else if(target<nums[i]){
                a=i;
                break;
            }
            else if(a==0){
                a=n;
            }       }
        return a;
    }
}