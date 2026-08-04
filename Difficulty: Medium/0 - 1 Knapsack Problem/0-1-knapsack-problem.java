class Solution {
    public int knapsack(int W,int val[], int wt[]) {
        // code here
        int n=wt.length;
        int[][] dp = new int[n+1][W+1];
        for(int[] arr:dp){
            Arrays.fill(arr,-1);
        }
        return solve(val, wt, n, W,dp);
    }
    public static int solve(int[] val,int[] wt,int n,int w,int[][]dp){
        if(n==0 || w==0)  return 0;
        else if(wt[n-1]>w) return solve(val,wt,n-1,w,dp);
        else if(dp[n][w]!=-1) return dp[n][w];
        else
        return dp[n][w]=Math.max(val[n-1]+solve(val,wt,n-1,w-wt[n-1],dp),solve(val,wt,n-1,w,dp));
    }
}