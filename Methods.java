// import java.util.Scanner;
// public class Methods {
//   public static void main(String[] args){
    // System.out.println("Enter numbers :");
    // Scanner sc = new Scanner(System.in);
    // int a = sc.nextInt();
    // int b = sc.nextInt();
    // int c = sc.nextInt();
    // int d = sc.nextInt();

    // System.out.println(Math.sqrt(n));
    // System.out.println(Math.cbrt(n));
    // System.out.println(Math.PI);     
      //  System.out.println(Math.floor(7.8));
      //  System.out.println(Math.floor(-7.8));
      // System.out.println(Math.min(a,Math.min(b,Math.min(c,d))));
      


  // }
// }
import java.util.Scanner;
public class Methods{
   public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
        int[] ans = swap(a,b);
        System.out.println(ans[0]+" "+ans[1]);
  sc.close();

  }
  public static int[] swap(int a,int b){
           int temp = a;
           a = b;
           b = temp;
           
           return new int[]{a,b};
           
  }
}
