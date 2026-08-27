class Solution {
    public int maxWater(int arr[]) {
        int max = 0;
        int left=0;
        int n = arr.length;
        int right =n-1;
        int area = 0;
        while(left < right){
            area = (right-left) * Math.min(arr[left],arr[right]);
            max = Math.max(max,area);
            if(arr[left] < arr[right]){
                left++;
            }else{
                right--;
            }
        }
        return max;
        
    }
}