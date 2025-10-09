// User function Template for Java

class Solution {
    public void segregateElements(int[] arr) {
        // Your code goes here
        List<Integer> pos = new ArrayList<>();
        List<Integer> neg = new ArrayList<>();
        for(int num : arr){
            if(num>=0){
                pos.add(num);
            }
            else neg.add(num);
        }
        int i=0;
        for(int num : pos){
            arr[i++] = num;
        }
        for(int num : neg){
            arr[i++] = num;
        }
    }
}