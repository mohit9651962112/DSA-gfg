class Solution {
    public void bubbleSort(int[] arr) {
        int n =arr.length;
        for(int i = n-1;i>=1;i--){
            for(int j =0;j<i;j++){
                if(arr[i]<arr[j]){
                    swap(arr,i,j);
                }
            }
        }
        
    }
    public void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] =arr[j];
        arr[j] = temp;
    }
}