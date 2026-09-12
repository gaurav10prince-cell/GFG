class Solution {
    public int maxSubarraySum(int[] arr, int k) {
        // Code here
        int n = arr.length;
        int sum = 0;
        int max = 0;
        for(int i=0;i<k;i++){
            sum += arr[i];
        }
        max = sum;
        for(int i=k;i<n;i++){
            sum = sum-arr[i-k]+arr[i];
            max = Math.max(sum,max);
        }
        return max;
    }
}