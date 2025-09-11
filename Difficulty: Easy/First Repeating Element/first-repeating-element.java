class Solution {
    public static int firstRepeated(int[] arr) {
        // code here
        Map<Integer, Integer>map = new HashMap<>();
        
        for(int a:arr){
            map.put(a, map.getOrDefault(a,0)+1);
        }
        for(int i=0;i<arr.length;i++){
            if(map.get(arr[i])>1){
                return i+1;
            }
        }
        return -1;
    }
}
