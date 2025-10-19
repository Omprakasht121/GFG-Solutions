class Solution {
    // Function to partition the array around the range such
    // that array is divided into three parts.
    public void threeWayPartition(int arr[], int a, int b) {
        // code here
         int low = 0, mid = 0, high = arr.length - 1;

        while (mid <= high) {
            if (arr[mid] < a) {
                // Move to the front
                swap(arr, low, mid);
                low++;
                mid++;
            } else if (arr[mid] > b) {
                // Move to the end
                swap(arr, mid, high);
                high--;
            } else {
                // In the range [a, b]
                mid++;
            }
        }

        // If we reach here, the partitioning is successful
        
        
    }
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}