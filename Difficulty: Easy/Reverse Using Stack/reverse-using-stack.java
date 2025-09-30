class Solution {
    public String reverse(String S) {
        // code here
        Stack<Character> stack = new Stack<>();
        
        for(char c: S.toCharArray()){
            stack.push(c);
        }
        String ans = new String();
        while(!stack.isEmpty()){
            ans+=stack.pop();
        }
        return ans;
    }
}