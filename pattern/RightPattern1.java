package pattern;
import java.util.*;
public class RightPattern1 {
   public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
    System.out.print("Enter The Length :");
     int n= sc.nextInt();

     for(int i=n;i>=1;i--){
        for(int j=1;j<=i;j++){
          System.out.print(i);
        }
        System.out.println( );
     }
     sc.close();
   } 
}
