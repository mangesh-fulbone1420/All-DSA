package pattern;
//import java.util.*;
public class DigitPattern {
    public static void main(String[] args) {
        int n = 3;

        for(int i=n; i>0;i--){
            for(int j=n;j>0;j--){
                for(int k=0;k<i;k++){

                    System.out.print(j +" ");
                }
            }
           System.out.println( );
        }
    }   

}
