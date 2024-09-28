package pattern;
import java.util.*;

public class CharacterPattern {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Ente The Length :");
        int n = sc.nextInt();
        for(int i=0; i<=n-1;i++){
            char ch= 'A';
            for(int j=0; j<=n-1;j++){
                System.out.print(ch+" ");
                ch=(char) (ch+1);
            }
            System.out.println( );
        }
sc.close();
    }
}
