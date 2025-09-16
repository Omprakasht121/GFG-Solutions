// User function Template for Java

class Solution {
    public int rowWithMax1s(int arr[][]) {
        // code here
        int fre[] = new int[2];
        int max=-1;
        int fremax =0;
        int n = arr.length;
        for(int i =0;i<n;i++){
            int temp[] = arr[i];
            for(int j =0;j<temp.length;j++){
                if(temp[j]==1){
                    fre[1]++;
                }
            }
            if(fre[1]>0 && fremax<fre[1]){
                max= Math.max(max,i);
                fremax = fre[1];
            }
            Arrays.fill(fre,0);
            
        }
        return max;
    }
}