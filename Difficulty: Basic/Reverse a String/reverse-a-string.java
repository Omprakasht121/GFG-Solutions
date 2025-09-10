class Solution {
    static String revStr(String s) {
        // code here
        // String ans ="";
        // int n=s.length();
        // for(int i=n-1;i>=0;i--){
        //     char c = s.charAt(i);
        //     ans += c;
        // }
        // return ans;
        
        char temp[] = s.toCharArray();
        for(int i=0;i<temp.length/2;i++){
            char a = temp[i];
            temp[i] = temp[temp.length-i-1];
            temp[temp.length-i-1] = a;
        }
        return String.valueOf(temp);
    }
}