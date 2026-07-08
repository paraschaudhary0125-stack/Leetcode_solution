class Solution {
    public String convertToBase7(int num) {
        if(num==0) return "0";
        String s="";
        int n=num;
        while(num!=0){
            int r=num%7;
            s=String.valueOf(Math.abs(r))+s;
            num=num/7;
        }
        if(n<0){
        s="-"+s;
        }
        return s;
    }
}