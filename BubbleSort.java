public class BubbleSort{
  public static void main(String[] args){
    int[] arr = {7,3,4,7,8,1};
    int n = arr.length;
    print(arr);
    for(int i=0;i<n-1;i++){
      boolean swapped = false;
    for(int j=0;j<n-1-i;j++){
        if(arr[j]>arr[j+1]){
          int temp = arr[j];
          arr[j] = arr[j+1];
          arr[j+1] = temp;
          swapped = true;
        }}
        if(!swapped) break;
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