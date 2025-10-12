// User function Template for Java

class Solution {
    public static String reverseString(String s) {
        // code here
        String ans = "";
        for(char c : s.toCharArray()){
            ans= c + ans;
        }
        return ans;
    }
}