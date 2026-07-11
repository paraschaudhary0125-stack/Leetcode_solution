class Solution {
    public boolean isStrictlyPalindromic(int n) {
        for(int i=2;i<=n-2;i++){
            String s=Integer.toString(n,i);
            for(int j=0;j<s.length()/2;j++){
                if(s.charAt(j)!=s.charAt(s.length()-j-1)){
                    return false;
                }
            }
        }
        return true;
    }
}