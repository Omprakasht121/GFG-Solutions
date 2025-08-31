class Solution {
    int missingNum(int arr[]) {
        // code here
        
        Boolean ans[] = new Boolean[arr.length+2];
        Arrays.fill(ans,false);
        
        for(int i :arr){
            ans[i] = true;
        }
        for(int i=1;i<ans.length;i++){
            if(ans[i]!=true) return i;
        }
        return 0;
    }
}