class Solution {
    public int reverse(int x) {
        int dig=x;
        int r;
        long n=0;
        if(x==-2147483648 | x==2147483647){
            return 0;
        }
        else{
        if(dig>=0){
        while(dig!=0){
            r=dig%10;
            dig=Math.floorDiv(dig,10);
            n=n*10+r;
        }
        if(n>2147483647){
            return 0;
        }
        else{
            return (int)n;
        }
        }
        else{
            
            dig=-1*dig;
            while(dig!=0){
            r=dig%10;
            dig=Math.floorDiv(dig,10);
            n=n*10+r;
        }
        if(n>2147483647){
            return 0;
        }
        else{
            return -1*((int)n);
        }
    }
    
    }}}