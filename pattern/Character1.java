package pattern;
import java.util.*;
public class Character1 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of N  :");
        int n = sc.nextInt();
        
        
          
        
          for(int i=1; i<=n; i++){
            char ch='A';
            for(int j=1; j<=n;j++){
                
                System.out.print(ch + " ");
                ch=(char) (ch+1);
            }
            System.out.println( );
          }
          sc.close();
    }
}
