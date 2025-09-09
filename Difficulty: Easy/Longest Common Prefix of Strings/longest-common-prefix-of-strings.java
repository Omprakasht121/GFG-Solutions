// User function Template for Java
class Solution {
    public String longestCommonPrefix(String arr[]) {
        // code here
        if(arr.length==0) return "";
        String s = arr[0];
        String ans ="";
        for(int i =0; i<s.length();i++){
            char c = s.charAt(i);
            boolean flag =false;
            for(String str : arr){
                if(str.charAt(i)==c){
                    flag =true;
                }
                else{
                    flag = false;
                    break;
                }
            }
            if(flag) ans += c;
            else break;
        }
        return ans;
    }
}