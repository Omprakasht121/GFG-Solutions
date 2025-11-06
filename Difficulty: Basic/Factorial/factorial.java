// User function Template for Java
class Solution {
    public static int nFactorial(int n) {
        if(n==0) return 1;

        // Write your code here
        

        return n * nFactorial(n-1);
    }
}