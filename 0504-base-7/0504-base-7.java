class Solution {
    public String convertToBase7(int num) {
        if(num==0) return "0";
        String s="";
        Boolean n=num<0;
        while(num!=0){
            s=String.valueOf(Math.abs(num%7))+s;
            num=num/7;
        }
        if(n){
        s="-"+s;
        }
        return s;
    }
}