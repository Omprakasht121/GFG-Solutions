class Solution {
    public String findLargest(int[] arr) {
        // code here
        String[] nums = new String[arr.length];
        for (int i = 0; i < arr.length; i++) {
            nums[i] = String.valueOf(arr[i]);
        }

        // Step 2: Sort using custom comparator
        Arrays.sort(nums, (a, b) -> (b + a).compareTo(a + b));

        // Step 3: Edge case — if the largest is "0", all are zeros
        if (nums[0].equals("0")) {
            return "0";
        }

        // Step 4: Build result
        StringBuilder result = new StringBuilder();
        for (String num : nums) {
            result.append(num);
        }

        return result.toString();
    }
}