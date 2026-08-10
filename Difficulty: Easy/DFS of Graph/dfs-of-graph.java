class Solution {
    public void dfs(ArrayList<ArrayList<Integer>> adj, int[] vis, ArrayList<Integer> ans, int node) {
        vis[node]++;
        ans.add(node);

        for(int nei : adj.get(node)) {
            if(vis[nei] == 0) {
                dfs(adj, vis, ans, nei);
            }
        }
    }
    public ArrayList<Integer> dfs(ArrayList<ArrayList<Integer>> adj) {
        int V = adj.size();
        ArrayList<Integer> ans = new ArrayList<>();
        int[] vis = new int[V];

        dfs(adj, vis, ans, 0);

        return ans;
    }
}