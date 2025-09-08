// // User function Template for Java

class Solution {
    public void rotate(int[] arr) {
        // code here
        int left =0;
        int right =arr.length-1;
        while(left<right){
            int temp = arr[left];
            arr[left] =arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        left = 1;
        right = arr.length-1;
        while(left<right){
            int temp = arr[left];
            arr[left] =arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
}