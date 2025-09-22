class Solution {
    public ArrayList<Integer> findMajority(int[] arr) {
        // Code here
        
        ArrayList<Integer> ans = new ArrayList<>();
        if(arr.length == 0) return ans;
        int n = arr.length/3;
        Map<Integer, Integer> map = new HashMap<>();
        for(int num : arr){
            map.put(num, map.getOrDefault(num, 0)+1);
        }
        for(int key : map.keySet()){
            if(map.get(key)>n){
                ans.add(key);
            }
        }
        Collections.sort(ans);
        return ans;
    }
}