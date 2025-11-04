// User function Template for Java

class Solution {
    // Function to search a given integer in a matrix.
    public boolean searchMatrix(int[][] mat, int x) {
        // code here
        for(int a[] : mat){
            for(int num : a){
                if(num == x) return true;
            }
        }
        return false;
    }
}
