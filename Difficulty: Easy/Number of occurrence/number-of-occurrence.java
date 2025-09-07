class Solution {
    int countFreq(int[] arr, int target) {
        // code here
        Map<Integer, Integer> map = new HashMap<>();
        for(int i:arr){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        if(map.containsKey(target)) return map.get(target);
        return 0;
    }
}
