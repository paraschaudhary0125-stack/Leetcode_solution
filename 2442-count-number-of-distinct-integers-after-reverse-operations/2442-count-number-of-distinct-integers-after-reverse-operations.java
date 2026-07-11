class Solution {
    public int countDistinctIntegers(int[] nums) {
        Set<Integer> s=new HashSet<>();
        for(int n:nums){
            s.add(n);
            StringBuilder k=new StringBuilder(String.valueOf(n));
            k.reverse();
            s.add(Integer.parseInt(k.toString()));
        }
        return s.size();
    }
}