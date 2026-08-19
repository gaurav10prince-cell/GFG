class Solution {
    public boolean searchMatrix(int[][] arr, int target) {
        int row=arr.length;
        int col=arr[0].length;
        int low=0,high=row*col-1;
        while(low<=high){
            int mid = (low+high)/2;
            int midRow = mid/col;
            int midCol = mid%col;
            if(arr[midRow][midCol]==target) return true;
            else if(arr[midRow][midCol]>target) high=mid-1;
            else low=mid+1;
        }
        return false;
        
    }
}
