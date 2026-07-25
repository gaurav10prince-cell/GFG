public class SelectionSort{
  public static void main(String[] args){
     int[] arr = {7,3,4,7,8,1};
    int n = arr.length;
    print(arr);
    for(int i=0;i<n-1;i++){
      int min = Integer.MAX_VALUE;
      int mindex = -1;
      for(int j=i;j<n;j++){
        if(arr[j]<min){
          min = arr[j];
          mindex = j;
        }
      }
      int temp = arr[i];
      arr[i] = arr[mindex];
      arr[mindex] = temp;
    }
    print(arr);
  }
  public static void print(int[] arr){
    for(int ele : arr){
      System.out.print(ele+" ");
    }
    System.out.println();
  }
}