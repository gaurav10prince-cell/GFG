public class SelectionMax{
  public static void main(String[] args){
    int[] arr = {8,4,1,9,-3,6,5};
    int n = arr.length;
    print(arr);
    for(int i=n-1;i>0;i--){
      int max = Integer.MIN_VALUE;
      int maxdex = -1;
      for(int j=0;j<=i;j++){
        if(arr[j]>max){
          max = arr[j];
          maxdex = j;
        }
      }
      int temp = arr[i];
      arr[i] = arr[maxdex];
      arr[maxdex] = temp;
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