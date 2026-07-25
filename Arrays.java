import java.util.Scanner;

public class Arrays {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter array size :"); 
    int n = sc.nextInt();
    int[] arr = new int[n];
    System.out.print("Enter array elements :");
    for(int i=0;i<n;i++){
     arr[i]  = sc.nextInt();
      }
      // int sum=0;
      // for(int i =0;i<n;i++){
      //   sum += arr[i];
      //   }
      //   System.out.print(sum);

      //  int max = arr[0];
      // int max = Integer.MIN_VALUE;
      // for(int i=1;i<n;i++){
      //   if(arr[i]>max){
      //     max = arr[i];
      //   }
      // }
      // System.out.print("Answer:" +max);

      // int min = Integer.MAX_VALUE;
      // for(int i=1;i<n;i++){
      //   if(arr[i]<min){
      //     min = arr[i];
      //   }
      // }
      // System.out.print("Answer:" +min);


      // int pro = 1;
      // for(int i=0;i<n;i++){
      //   pro *= arr[i];
      // }
      // System.out.println(pro);

//       int product = 1;
//       for(int i=0;i<n;i++){
//         product*=arr[i];
//       }
// System.out.println(product);

      // int min = arr[0];
      // for(int i=0;i<n;i++){
      //   if(arr[i]<min){
      //     min = arr[i];
      //   }
      // }
      // System.out.println(min);
      // print(arr);
      // for(int i=0;i<n;i++){
      //    if(i%2==0)arr[i] += 10;
      //    else arr[i] *= 2;
      // }
      // print(arr);


      // }
      // public static void print(int[] arr){
      //   for(int i=0;i<arr.length;i++){
      //       System.out.println(arr[i]+" ");
      //   }

//LINEAR SEARCH ---->>

        //  int target = 10;
        //  boolean flag = false;
        //  for(int i=0;i<n;i++){
        //   if(arr[i]==target){
        //     flag = true;
        //     break;
        //   }
        // }
        //   if(flag == true) 
        //     System.out.println("Target Found");
        //   else
        //     System.out.println("Target Missing");


        for(int element : arr){
          System.out.println(element+" ");
        }
          }
         }
      
    
  

