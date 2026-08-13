class Solution {
    public ArrayList<Integer> dijkstra(int V, int[][] edges, int src) {
        ArrayList<ArrayList<int[]>> adj = new ArrayList<>();

        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }

        for (int[] e : edges) {
            adj.get(e[0]).add(new int[]{e[1], e[2]});
            adj.get(e[1]).add(new int[]{e[0], e[2]});
        }

        int[] dist = new int[V];
        Arrays.fill(dist, Integer.MAX_VALUE);

        PriorityQueue<int[]> pq = new PriorityQueue<>(
            (a, b) -> Integer.compare(a[0], b[0])
        );

        dist[src] = 0;
        pq.offer(new int[]{0, src});

        while (!pq.isEmpty()) {
            int[] cur = pq.poll();

            int d = cur[0];
            int node = cur[1];

            if (d != dist[node]) {
                continue;
            }

            for (int[] edge : adj.get(node)) {
                int neighbour = edge[0];
                int weight = edge[1];

                if (d + weight < dist[neighbour]) {
                    dist[neighbour] = d + weight;
                    pq.offer(new int[]{dist[neighbour], neighbour});
                }
            }
        }

        ArrayList<Integer> ans = new ArrayList<>();

        for (int d : dist) {
            ans.add(d);
        }

        return ans;
    }
}