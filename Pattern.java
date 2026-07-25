import java.util.Scanner;
public class Pattern{
  public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of n:");
        int n = sc.nextInt();
      //   for(int i=1;i<=n;i++){
      //     for(int j=1;j<=i;j++){
      //       if(i%2==0){
      //       System.out.print((char)(i+64)+" ");
      //     }else{
      //       System.out.print(i+" ");
      //     }
      //   }
      //     System.out.println();
        
      // }
    //   for(int i=n;i>=1;i--){
    //     for(int j=1;j<=i;j++){
    //       System.out.print("*");
    //   }
    //       System.out.println();
    // }
    // int a = n;
    //  for(int i=1;i<=n;i++){
    //     for(int j=1;j<=a;j++){
    //       System.out.print((char)(i+64)+" ");           //inverted rectangle 
    //   }
    //   a--;
    //       System.out.println();
    // }
    
    //Hollow Rectangle --->>>
    // for(int i=1;i<=m;i++){
    //   for(int j=1;j<=n;j++){
    //     if(i==1 || i==m || j==1 || j==n){
    //     System.out.print("* ");
    //     }else{
    //       System.out.print("  ");
    //     }
    //   }
    //   System.out.println();
    // }

    //star plus -->>
    // int mid = (n/2)+1;
    // for(int i=1;i<=n;i++){
    //   for(int j=1;j<=n;j++){
    //     if(i==mid || j==mid){
    //       System.out.print("* ");
    //     }else{
    //       System.out.print("  ");
    //     }
    //   }
    //   System.out.println();
    // }

    // for(int i=1;i<=n;i++){
    //   for(int j=1;j<=n;j++)
    //     {
    //     if(i+j>n){
    //       System.out.print("* ");
    //     }else{
    //       System.out.print("  ");
    //     }
    //   }
    //   System.out.println();    
    // }
    // int nsp =n-1 , nst = 1;
    // for(int i=1;i<=n;i++){
    //   for(int j=1;j<=nsp;j++)
    //     {
    //      System.out.print("  ");  //spaces
    //     }
    //     for(int j=1;j<=nst;j++){
    //         System.out.print("* ");   //stars
    //     }
    //     nst+=2;
    //     nsp--;
    //     System.out.println();
    //   }


    // int nsp =n-1 , nst = 1;
    // for(int i=1;i<=n;i++){
    //   for(int j=1;j<=nsp;j++)
    //     {
    //      System.out.print("  ");  //spaces
    //     }
    //     for(int j=1;j<=nst;j++){
    //         System.out.print("* ");   //stars
    //     }
    //     nst+=2;
    //     nsp--;
    //     System.out.println();
    //   }
  //   

  // int nsp = 1;
  //      int nst = 2*n-3;
  //   for(int i=1;i<=n;i++){
  //     for(int j=1;j<=nsp;j++)
  //       {
  //        System.out.print("  ");  //spaces
  //       }
  //       for(int j=1;j<=nst;j++){
  //           System.out.print("* ");   //stars
  //       }
  //       nst-=2;
  //       nsp++;
  //       System.out.println();
  // }

   //Bridge--->>>
      
  //   for(int i=1;i<=2*n-1;i++){
  //       System.out.print("* ");
  //      }
  //      System.out.println();
  //      int nsp = 1;
  //   for(int i=1;i<=n-1;i++){             //lines
  //     for(int j=1;j<=n-i;j++){
  //        System.out.print("* ");  //stars
  //       }
  //       for(int j=1;j<=nsp;j++){
  //           System.out.print(" "+" ");   //spaces
  //       }
  //       for(int j=1;j<=n-i;j++){
  //        System.out.print("* ");  //stars
  //       }
  //       nsp+=2;
  //       System.out.println();
  // }

  //spiral-->>

  for(int i=1;i<=n;i++){
    for(int j=1;j<=n;j++){
      System.out.print(Math.min(i,j)+" ");
      }
    System.out.println();
  }
}
}

