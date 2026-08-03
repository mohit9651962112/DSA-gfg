class Solution {
    public int maxSumSubarray(int[] arr) {
       int noPower = arr[0];
       int power  = 0;
       int res = arr[0];
       int res2 = arr[0];
       for(int i =1;i<arr.length;i++){
           int v1 = arr[i];
           int v2 = noPower + arr[i];
           int v3 = power + arr[i];
           int v4 = noPower;
           res = Math.max(Math.max(v1,v2),Math.max(v3,v4));
           res2 = Math.max(res2,res);
           noPower = Math.max(v1,v2);
           power = Math.max(v3,v4);
       }
       return res2;
        
    }
}