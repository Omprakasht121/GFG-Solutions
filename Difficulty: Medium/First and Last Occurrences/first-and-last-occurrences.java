// User function Template for Java

class GFG {
    ArrayList<Integer> find(int arr[], int x) {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        int first = -1;
        int second =-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i] == x && first == -1){
                first = i;
            }
            else if(arr[i] == x){
                second = i;
            }
        }
        if(first != -1 && second == -1){
            second = first;
        }
        ans.add(first);
        ans.add(second);
        return ans;
    }
}
