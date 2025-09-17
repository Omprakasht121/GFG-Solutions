import java.util.Arrays;

class Solution {
    public void rearrange(int arr[]) {
        int ans[] = new int[arr.length];
        Arrays.sort(arr); 
        int left = 0;
        int right = arr.length - 1;
        int i = 0;

        while (left <= right) {
            if (i < arr.length) {
                ans[i] = arr[right];
                i++;
                right--;
            }
            if (left <= right && i < arr.length) {
                ans[i] = arr[left];
                i++;
                left++;
            }
        }

        // Copy back to original array
        for (i = 0; i < arr.length; i++) {
            arr[i] = ans[i];
        }
    }
}
