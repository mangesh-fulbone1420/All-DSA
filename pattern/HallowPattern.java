package pattern;
import java.util.*;
public class HallowPattern {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter The length of N :");
        int n = sc.nextInt();
        System.out.print("Enter The length of M :");
        int m = sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if (i==1 || i==n || j==m || j==1 ) {
                    System.out.print(i);
                    
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println( );
            sc.close();
        }
    }
}
