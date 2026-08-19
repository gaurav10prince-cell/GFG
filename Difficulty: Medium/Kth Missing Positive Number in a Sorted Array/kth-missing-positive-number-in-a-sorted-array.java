class Solution {
    public int kthMissing(int[] arr, int k) {
        // code here
        int n = arr.length;
        int low=0,high=n-1;
        while(low<=high){
            int mid = (low+high)/2;
            int correct = mid+1;
            int missing = arr[mid]-correct;
            if(missing>=k) high = mid-1;
            else low=mid+1;
        }
        return high+1+k;
    }
}