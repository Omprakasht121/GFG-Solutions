class Solution {
    public int kthElement(int a[], int b[], int k) {
        // code here
        ArrayList<Integer> result = new ArrayList<>();
        int first = 0;
        int second =0;
        while(first<a.length && second<b.length){
            if(a[first]<=b[second]){
                result.add(a[first]);
                first++;
            }
            else if(a[first]>b[second]){
                result.add(b[second]);
                second++;
            }
        }
        while(first<a.length){
            result.add(a[first]);
            first++;
        }
        while(second<b.length){
            result.add(b[second]);
            second++;
        }
        return result.get(k-1);
    }
}