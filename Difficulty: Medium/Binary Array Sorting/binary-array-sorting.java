class Solution {
    public void binSort(int[] arr) {
        // code here
        int countzero =0;
        for(int num : arr){
            if(num ==0) countzero++;
        }
        for(int i=0;i<arr.length;i++){
            if(i<countzero){
                arr[i] =0;
            }
            else{
                arr[i] =1;
            }
        }
    }
}
