// User function template for Java

class Solution {
    static String delAlternate(String S) {
        // code here
        String ans = "";
        for(int i=0;i<S.length();i++){
            ans = ans + S.charAt(i);
            i++;
        }
        return ans;
    }
}