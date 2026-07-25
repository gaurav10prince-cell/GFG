public class TwoSum {
  public static void main(String[] args){
    int[] arr = {1,2,4,3,6,5,8};
    int target = 9;
    int n = arr.length;
    int i=0;
    int j=n-1;
    boolean ans = false;
    while(i<j){
      int sum = arr[i]+arr[j];
      if(sum==target)
        System.out.println("true");
      else if(sum<target) i++;
      else j--;
    }
    System.out.println(false);
  }
}
