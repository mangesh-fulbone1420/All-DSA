package pattern;
import java.util.*;
public class Number {
    public static void main(String[] args) {
        int num=1;
        Scanner sc = new Scanner( System.in);
        System.out.print("Enter the Length N :");
        int  n = sc.nextInt();
        System.out.print("Enter the Length M :");
        int  m = sc.nextInt();

        for(int i=0; i<n;i++){
            for(int j=1; j<=m; j++){
                System.out.print(num +" ");
                num ++;
            }
            System.out.println( );
        }
        sc.close();
    }
}
