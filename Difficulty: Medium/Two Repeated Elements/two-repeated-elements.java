class Solution {
    public int[] twoRepeated(int[] arr) {
        // code here
        int ans[] = new int[2];
        int i=0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num : arr){
            map.put(num,map.getOrDefault(num,0)+1);
            if(map.get(num)>=2){
                ans[i++] = num;
            }
        }
        return ans;
    }
}