class Solution {
    public char nonRepeatingChar(String s) {
        // code here
        Map <Character, Integer>map = new HashMap<>();
        for(char c : s.toCharArray()){
            map.put(c, map.getOrDefault(c,0)+1);
        }
        for(char c :s.toCharArray()){
           if(map.get(c) == 1){
               return c;
           }
        }
        return '$';
   
    }
}
