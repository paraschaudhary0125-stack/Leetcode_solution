class Solution {
    public boolean isPalindrome(int x) {
        long k=x;
        long r,rev=0;
        while(k!=0){
            r=k%10;
            k=Math.floorDiv(k,10);
            rev=rev*10+r;
            if(k==-1){
                k=0;
            }
        }
        if (x>=0){
            if(rev==x){
                return true;

            }
            else{
                return false;
            }
        }
        else{
                return false;
            }
    }
}