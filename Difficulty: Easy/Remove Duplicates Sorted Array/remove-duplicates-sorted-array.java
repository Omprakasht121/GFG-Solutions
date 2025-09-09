class Solution {
    // Function to remove duplicates from the given array.
    ArrayList<Integer> removeDuplicates(int[] arr) {
        // code here
        ArrayList<Integer> result = new ArrayList<>();
        HashMap<Integer, Boolean> map = new HashMap<>();
        for(int num : arr){
            if(!map.containsKey(num)){
                map.put(num,true);
                result.add(num);
            }
        }
        return result;
    }
}
