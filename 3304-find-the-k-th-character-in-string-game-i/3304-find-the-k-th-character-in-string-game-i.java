class Solution {
    public char kthCharacter(int k) {
        StringBuilder s=new StringBuilder();
        s.append('a');
        while(s.length()<=k){
            int n=s.length();
            for(int i=0;i<n;i++){
                char c=s.charAt(i);
                if(c=='z'){
                    c='a';
                }
                else{
                c++;}
                s.append(c);
            }
        }
        return s.charAt(k-1);
    }
}