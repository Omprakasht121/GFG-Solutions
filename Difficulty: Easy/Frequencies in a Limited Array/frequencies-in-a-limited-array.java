class Solution {
    public List<Integer> frequencyCount(int[] arr) {
        // code here
        Map<Integer, Integer> map = new HashMap<>();
        for(int i:arr){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        ArrayList<Integer> list = new ArrayList<>();
        int i=1;
        while(i<=arr.length){
            if(map.containsKey(i)){
                list.add(map.get(i));
            }
            else list.add(0);
            i++;
        }
        return list;
    }
}
