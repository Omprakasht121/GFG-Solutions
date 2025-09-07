class Solution {
    void pushZerosToEnd(int[] arr) {
        // code here
        int left =0;
        int right =1;
        while(right<arr.length){
            if(arr[left]==0  ){
                if(arr[right] !=0){
                    int temp =arr[left];
                    arr[left] = arr[right];
                    arr[right] = temp;
                    left++;
                }
                // else right++;
            }
            else{
                left++;
            }
            right++;
        }
         
    }
}