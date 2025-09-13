class Solution {
    public String reverseWords(String s) {
        // Code here
        s = s.replaceAll("^\\.|\\.$", "");
        String ans = "";
        String temp ="";
        boolean flag = false;
        for(int i =0;i<s.length();i++){
            if(s.charAt(i) != '.'){
                temp = temp+s.charAt(i);
                flag = true;
            }
            else if(flag){
                ans = "." +temp + ans;
                temp ="";
                flag = false;
            }
        }
        ans = temp + ans;
        if(ans.charAt(0) == '.') return ans.substring(1);
        return ans;
    }
}
