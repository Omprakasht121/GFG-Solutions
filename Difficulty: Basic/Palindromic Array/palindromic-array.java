/*Complete the Function below*/
class Solution {
    public static boolean isPalinArray(int[] arr) {
        // add code here.
        for(int n : arr){
            if(!isPalindrome(n)) return false;
        }
        return true;
    }
    public static boolean isPalindrome(int n){
        int num = n;
        int rev =0;
        while(num>0){
            int x = num%10;
            rev = rev *10 +x;
            num = num /10;
        }
        if( n == rev) return true;
        return false;
    }
}