package pattern;

public class InvertedTrangle {
    public static void main(String[] args) {
        
    
    int n=5 ,i;
    //int num = 1;
    for( i=0; i<n;i++)
    for(int j=0;j<i;j++){
        System.out.print(" ");

    }
    for(int j=0;j<n-i;j++){
        System.out.print( (i+1) +" ");
    }
    System.out.println( );
}
}
