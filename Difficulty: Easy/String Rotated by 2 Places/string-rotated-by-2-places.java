class Solution {
    public static boolean isRotated(String s1, String s2) {
        // code here  
        int n = s1.length();
        if (n < 2) return false;

        String ans = s1.substring(2)+s1.substring(0,2);
        if(ans.equals(s2)) return true;
        String ans1 = s1.substring(n-2) + s1.substring(0, n-2);
        if(ans1.equals(s2)) return true;
        return false;
    }
}