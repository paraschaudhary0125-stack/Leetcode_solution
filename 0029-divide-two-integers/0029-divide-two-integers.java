class Solution {
    public int divide(int dividend, int divisor) {
        if((dividend >0 && divisor >0) | (dividend <0 && divisor <0)){
            if(dividend==-2147483648 && divisor==-1){
                return 2147483647;
            }
            else{
            return Math.floorDiv(dividend,divisor);}
        }
        else if(dividend==0){
            return 0;
        }
        else{
            if(dividend%divisor==0){
                return Math.floorDiv(dividend,divisor);
            }
            else{
            return Math.floorDiv(dividend,divisor)+1;}
        }
    }
}