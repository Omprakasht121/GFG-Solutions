// User function Template for Java

class Solution {
    void rearrange(ArrayList<Integer> arr) {
        ArrayList<Integer> positives = new ArrayList<>();
        ArrayList<Integer> negatives = new ArrayList<>();

       
        for (int num : arr) {
            if (num >= 0) {
                positives.add(num);
            } else {
                negatives.add(num);
            }
        }

        // Step 2: Merge alternately
        ArrayList<Integer> result = new ArrayList<>();
        int i = 0, j = 0;

        while (i < positives.size() && j < negatives.size()) {
            result.add(positives.get(i++)); // positive first
            result.add(negatives.get(j++)); // then negative
        }

        
        while (i < positives.size()) result.add(positives.get(i++));
        while (j < negatives.size()) result.add(negatives.get(j++));
        arr.clear();
        
        for(int num:result){
            arr.add(num);
            
        }
        
    }
}