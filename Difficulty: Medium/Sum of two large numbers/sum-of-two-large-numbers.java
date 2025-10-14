// User function Template for Java

class Solution {
    String findSum(String s1, String s2) {
        // code here
        s1 = s1.replaceFirst("^0+", "");
        s2 = s2.replaceFirst("^0+", "");
        
        // If empty after removing zeros, it's 0
        if (s1.isEmpty()) s1 = "0";
        if (s2.isEmpty()) s2 = "0";
        
        StringBuilder ans = new StringBuilder();
        int i = s1.length() - 1;
        int j = s2.length() - 1;
        int carry = 0;

        while (i >= 0 || j >= 0 || carry > 0) {
            int d1 = (i >= 0) ? s1.charAt(i) - '0' : 0;
            int d2 = (j >= 0) ? s2.charAt(j) - '0' : 0;

            int sum = d1 + d2 + carry;
            ans.append(sum % 10);
            carry = sum / 10;

            i--;
            j--;
        }

        return ans.reverse().toString();
    }
}