class Solution {
    public int binarySubstring(String s) {
        // code here
        int ones = 0;

        // Count number of '1's
        for (char c : s.toCharArray()) {
            if (c == '1') ones++;
        }

        // Number of substrings that start and end with '1'
        return (ones * (ones - 1)) / 2;
    }
}