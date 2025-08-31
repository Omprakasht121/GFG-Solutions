// User function Template for Java

class Solution {

    public static String PartyType(int arr[]) {
        // Your code goes here
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i:arr){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(int i:arr){
            if(map.get(i)>1) return "true";
        }
        return "false";
    }
}