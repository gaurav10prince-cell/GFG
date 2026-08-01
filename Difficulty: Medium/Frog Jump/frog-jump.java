class Solution {
    static int[] dp;
    int minCost(int[] height) {
        // code here
        int n = height.length;
        dp = new int[n];
        Arrays.fill(dp,-1);
        return frog(height,n-1);
        
    }
    static int frog(int[] height, int n){
    if(n==0) return 0;
    if(n==1) return Math.abs(height[1]-height[0]);

    if(dp[n]!=-1) return dp[n];

    int one = frog(height,n-1)+Math.abs(height[n]-height[n-1]);
    int two = frog(height,n-2)+Math.abs(height[n]-height[n-2]);
    return dp[n]=Math.min(one,two);
  }
}