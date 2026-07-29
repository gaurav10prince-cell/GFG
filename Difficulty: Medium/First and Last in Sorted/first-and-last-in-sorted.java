class Solution {
    ArrayList<Integer> find(int arr[], int x) {
        int first = firstoccur(arr,x);
        int last = lastoccur(arr,x);
        ArrayList<Integer> list = new ArrayList<>();
        list.add(first);
        list.add(last);
        return list;
        
    }
    public int firstoccur(int[] arr, int x) {
        int s = 0, e = arr.length - 1;
        int mid,index=-1;
        while(s<=e) {
            mid=(s+e)/2;
            if (arr[mid]==x) {
                index=mid;
                e=mid-1; 
            } else if (x > arr[mid]) {
                s=mid+1;
            } else{
                e=mid-1;
            }
        }
        return index;
    }

    public int lastoccur(int[] arr, int x) {
        int s = 0, e = arr.length - 1;
        int mid, index = -1;
        while (s <= e) {
            mid = (s + e) / 2;
            if (arr[mid] == x) {
                index = mid;
                s = mid+1; 
            } else if (x > arr[mid]) {
                s = mid + 1;
            } else {
                e = mid - 1;
            }
        }
        return index;
    }
}
