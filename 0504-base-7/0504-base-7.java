class Solution {
    public String convertToBase7(int num) {
        if(num==0) return "0";
        String s="";
        if(num>0){
        while(num!=0){
            int r=num%7;
            s=String.valueOf(r)+s;
            num=num/7;
        }}
        else{
            num=-num;
            while(num!=0){
            int r=num%7;
            s=String.valueOf(r)+s;
            num=num/7;
        }
        s="-"+s;
        }
        return s;
    }
}