class Solution {
    static ArrayList<Integer> nextSmallerEle(int[] arr) {
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            int a = -1;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[i]){
                    a= arr[j];
                    break;
                }
            }
            list.add(a);
        }
        return list;
    }
}