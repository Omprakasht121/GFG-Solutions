class Solution {
    public boolean areIsomorphic(String s1, String s2) {
        // code here
        if(s1.length() != s2.length()) return false;
        Map<Character, Character> map1 = new HashMap<>();
        Map<Character, Character> map2 = new HashMap<>();
        for(int i=0;i<s1.length();i++){
            char ch1 = s1.charAt(i);
            char ch2 = s2.charAt(i);
            if(!map1.containsKey(ch1)){
                map1.put(ch1,ch2);
            }
            else if(map1.get(ch1) != ch2) return false;
            
            if(!map2.containsKey(ch2)){
                map2.put(ch2,ch1);
            }
            else if(map2.get(ch2) != ch1) return false;
            
        }
        return true;
    }
}