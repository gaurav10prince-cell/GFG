public class BinarySearch {
  public static void main(String[] args) {
      int[] arr = {1,2,3,4,5,6,7,8,9,10};
      int target = 11;
      int n = arr.length;
      int left = 0;
      int right = n-1;

      while(left<=right){
        int mid = left+(right-left)/2;
        if(arr[mid]==target){
          System.out.println("Target found");
          return;
        }
        else if(arr[mid]<target){
          left = mid+1;
        }
        else{
          right = mid-1;
        }
      }
      System.out.println("Target not found");
  }
}
