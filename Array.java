public class Array {
  public static void main(String[] args){
    // ArrayList<Integer> arr = new ArrayList<>();
    // arr.add(1);       //insertion 
    // arr.add(2);
    // arr.add(3);
    // arr.add(4);
    // arr.add(5);
    // System.out.println(arr);
    // System.out.println(arr.get(2));  //arr[2]
    // arr.set(3,50);           //arr[3]=50
    // System.out.println(arr);    
    
    // int i=0, j=arr.size()-1;          //reverse using ArrayList-->>
    // while(i<j){
    //   int temp = arr.get(i);
    //   arr.set(i,arr.get(j));
    //   arr.set(j,temp);
    //   i++;
    //   j--;
    // }
    // System.out.println(arr);

    // ArrayList<Integer> ans = new ArrayList<>();
    // int[] arr1 = {3,5,2,7};
    // int[] arr2 = {9,2,11};

    // int i = arr1.length-1;
    // int j = arr2.length-1;
    // int carry = 0;

    // while(i>=0 || j>=0 || carry!=0){
    //      int sum = carry;
    //      if(i>=0){
    //       sum += arr1[i];
    //       i--;
    //      }
    //      if(j>=0){
    //       sum += arr2[j];
    //       j--;
    //      }
    //      ans.add(sum%10);
    //      carry = sum/10;

    // }
    // Collections.reverse(ans);
    // System.out.println(ans);
    
    

    int[] a = {2,5,6,9};
    int[] b = {1,3,4,5,7,8};
    int[] c = new int[a.length + b.length];

    merge(c,a,b);
    for(int ele : c) System.out.print(ele+" ");
  }
public static void merge(int[] c, int[] a, int[] b){
    int i=0,j=0,k=0;
    while(i<a.length && j<b.length){
      if(a[i]<b[j]) c[k++] = a[i++];
      else c[k++] = b[j++];
      }
      if(i==a.length){
        while(j<b.length){
          c[k++] = b[j++];
        }
      }
      if(j==b.length){
        while(i<a.length){
          c[k++] = a[i++];
        }
      }
    }
}
