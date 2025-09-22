class Solution {
    public ArrayList<Integer> kLargest(int[] arr, int k) {
        // Your code here
        ArrayList<Integer> list = new ArrayList<>();
        Arrays.sort(arr);
        int i=1;
        while(i<=k){
            int ele = arr[arr.length-i];
            list.add(ele); 
            i++;
        }
        return list;
    }
}
