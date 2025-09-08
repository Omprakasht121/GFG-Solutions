class Solution {
    public void mergeArrays(int a[], int b[]) {
        // code here
        int left = 0;
        
        while(left<a.length){
            
            if(a[left] > b[0]){
                int temp = a[left];
                a[left] = b[0];
                b[0] = temp;
                
                int first = b[0];
                int k=1;
                while(k<b.length && b[k]<first){
                    b[k-1] = b[k];
                    k++;
                }
                b[k-1] = first;
            }
            
            left++;
        }
    }
}
