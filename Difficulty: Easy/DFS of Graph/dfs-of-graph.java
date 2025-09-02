class Solution {
    // Function to return a list containing the DFS traversal of the graph.
    public ArrayList<Integer> dfs(ArrayList<ArrayList<Integer>> adj) {
        // Code here
        int V = adj.size();
        ArrayList<Integer> result = new ArrayList<>();
        boolean visited[] = new boolean[V];
        helper(0,visited, adj, result);
        
        return result;
    }
    public void helper(int node, boolean visited[], ArrayList<ArrayList<Integer>> adj, ArrayList<Integer> result){
        visited[node] = true;
        result.add(node);
        for(int temp: adj.get(node)){
            if(!visited[temp]){
                helper(temp, visited,adj,result);
            }
        }
    }
}