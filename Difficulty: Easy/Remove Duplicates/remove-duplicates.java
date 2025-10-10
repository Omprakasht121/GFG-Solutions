// User function Template for Java

class Solution {
    String removeDups(String s) {
        // code here
        Map<Character, Integer> map = new HashMap<>();
        String ans ="";
        for(char c : s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
            if(map.get(c) == 1){
                ans = ans + c;
            }
        }
        return ans;
    }
}