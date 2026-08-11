class Solution {
    void dfs(int node, ArrayList<ArrayList<Integer>> adj, int[] vis) {
        vis[node]++;

        for (int nei : adj.get(node)) {
            if (vis[nei]==0) {
                dfs(nei, adj, vis);
            }
        }
    }
    int countConnected(int V, ArrayList<ArrayList<Integer>> edges) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }
        for (ArrayList<Integer> edge : edges) {
            int u = edge.get(0);
            int v = edge.get(1);

            adj.get(u).add(v);
            adj.get(v).add(u);
        }
        int[] vis = new int[V];
        int count = 0;

        for (int i = 0; i < V; i++) {
            if (vis[i]==0) {
                count++;
                dfs(i, adj, vis);
            }
        }
        return count;
    }
}