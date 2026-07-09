class Solution {
    public int findNumbers(int[] nums) {
        int count=0;
        for(int n:nums){
            if(n>9 && n<100){
                count++;
            }
            else if(n>999 && n<10000){
                count++;
            }
            else if(n>99999 && n<=100000){
                count++;
            }
        }
        return count;
    }
}