// User function Template for Java

class Solution {
    public static ArrayList<ArrayList<Integer>> getPairs(int[] arr) {
        // code here
          Arrays.sort(arr); // Sort array first
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();

        int left = 0, right = arr.length - 1;

        while (left < right) {
            int sum = arr[left] + arr[right];

            if (sum == 0) {
                result.add(new ArrayList<>(Arrays.asList(arr[left], arr[right])));

                int leftVal = arr[left];
                int rightVal = arr[right];

                // Skip duplicates
                while (left < right && arr[left] == leftVal) left++;
                while (left < right && arr[right] == rightVal) right--;

            } else if (sum < 0) {
                left++;
            } else {
                right--;
            }
        }

        return result;
    }
}
