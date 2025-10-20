// User function Template for Java

class Solution {
    public List<Integer> valueEqualToIndex(List<Integer> nums) {
        // code here
        List<Integer> ans = new ArrayList<>();
        for(int i=0;i<nums.size();i++){
            if(nums.get(i) == i+1){
                ans.add(nums.get(i));
            }
        }
        return ans;
    }
}