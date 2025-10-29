class Solution {
    public char getMaxOccuringChar(String s) {
        // code here
        HashMap<Character, Integer> map = new HashMap<>();
        
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        char ch = 0; // or ' ' (a space) — initialize to a valid char
        int max = 0;

        for (char c : map.keySet()) {
            if (map.get(c) > max) {
                max = map.get(c);
                ch = c;
            } else if (map.get(c) == max && ch > c) {
                ch = c; // choose lexicographically smaller character
            }
        }
        return ch;
    }
}