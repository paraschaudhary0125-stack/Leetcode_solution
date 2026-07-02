class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        PriorityQueue<Integer> q=new PriorityQueue<>();
        for(int i=0;i<nums1.length;i++){
            q.add(nums1[i]);
        }
        for(int i=0;i<nums2.length;i++){
            q.add(nums2[i]);
        }
        ArrayList<Integer> n = new ArrayList<>();
        while (!q.isEmpty()) {
            n.add(q.poll()); 
            }
        double a=0;
        int nn=n.size();
        if(n.size()%2!=0){
            a=n.get((nn)/2);
        }else{
            a=(n.get((nn/2)-1)+n.get(nn/2))/2.0;
        }
        return a;
   }
}