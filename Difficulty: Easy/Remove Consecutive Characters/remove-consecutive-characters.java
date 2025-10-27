// User function Template for Java

class Solution {
    public String removeConsecutiveCharacter(String s) {
        // code here
         StringBuilder ans = new StringBuilder();
        
        for (int i = 0; i < s.length(); i++) {
            // add character if it is not same as the next one
            if (i == s.length() - 1 || s.charAt(i) != s.charAt(i + 1)) {
                ans.append(s.charAt(i));
            }
        }
        
        return ans.toString();
    }
}