class Solution {
    public int xorOperation(int n, int start) {
        int nn=start;
        for(int i=1;i<n;i++){
            nn+=2;
            start=start^nn;
        }
        return start;
    }
}