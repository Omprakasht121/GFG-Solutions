// User function Template for Java

class Solution {
    public int longestSubarray(int[] arr, int k) {
        // code here
        // brute  force
        // int max =0;
        // for(int i=0;i<arr.length;i++){
        //     int sum =0;
        //     for(int j=i;j<arr.length;j++){
        //         sum =sum + arr[j];
        //         if(sum==k){
        //             max = Math.max(max,j-i+1);
        //         }
        //     }
        // }
        // return max;
        
        Map<Integer, Integer> map = new HashMap<>(); // prefixSum → index
        int prefixSum = 0;
        int maxLen = 0;

        for (int i = 0; i < arr.length; i++) {
            prefixSum += arr[i];

            // Case 1: if prefixSum itself equals k
            if (prefixSum == k) {
                maxLen = Math.max(maxLen, i + 1);
            }

            // Case 2: check if prefixSum - k exists
            if (map.containsKey(prefixSum - k)) {
                int prevIndex = map.get(prefixSum - k);
                maxLen = Math.max(maxLen, i - prevIndex);
            }

            // Store prefixSum if not already stored (keep earliest index)
            map.putIfAbsent(prefixSum, i);
        }

        return maxLen;

    }
}
