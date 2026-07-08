class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> n=new ArrayList<>();
        for(int i=left; i<=right;i++){
            int f=(String.valueOf(i)).length();
            int k=i;
            for(int j=0;j<f;j++){
                int r=k%10;
                if(r==0) break;
                if(i%r!=0){
                    break;
                }
                k/=10;
            }
            if(k==0){
                n.add(i);
            }
        }
        return n;
    }
}