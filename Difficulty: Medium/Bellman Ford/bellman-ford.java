class Solution {
    public ArrayList<Integer> bellmanFord(int V, int[][] edges, int src) {
        // code here
        int INF = (int) 1e8;
        ArrayList<Integer> dist = new ArrayList<Integer>();
        for(int i=0;i<V;i++){
            dist.add(INF);
        }
        dist.set(src,0);
          for(int i=0;i<V-1;i++){
              for(int[] edge : edges){
                  int u = edge[0];
                  int v = edge[1];
                  int w = edge[2];
                  
                  if(dist.get(u) != INF && dist.get(u)+w<dist.get(v)){
                      dist.set(v,dist.get(u)+w);
                  }
              }
          }
                 for(int[] edge : edges){
                  int u = edge[0];
                  int v = edge[1];
                  int w = edge[2];
                  
                  if(dist.get(u)!=INF && dist.get(u)+w<dist.get(v)){
                      ArrayList<Integer> ans = new ArrayList<>();
                      ans.add(-1);
                      return ans;
                  }
                 }
                 return dist;
    }
}
