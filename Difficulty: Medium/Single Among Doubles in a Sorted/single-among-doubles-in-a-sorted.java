class Solution {
    int single(int[] arr) {
        int n = arr.length;
        if(arr.length==1) return arr[0];
        if(arr[0]!=arr[1]) return arr[0];
        if(arr[n-1]!=arr[n-2]) return arr[n-1]; 
        int left = 0,right = n-1;
        while(left<=right){
            int mid = left+(right-left)/2;
            if(arr[mid]!=arr[mid-1] && arr[mid]!= arr[mid+1]) return arr[mid];
            int first = mid, sec = mid;
            if(arr[mid-1]==arr[mid]) first = mid-1;
            else sec = mid+1;
            int leftCount = first-left;
            int rightCount = right-sec;
            if(leftCount%2 == 0) left = sec+1;
            else right = first-1;
        }
        return -1;
        
    }
}