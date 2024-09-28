import java.util.*;
public class SumOfNaturalNum {
    public static void main(String[] args) {
        System.out.print("Enter the Number :");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++){
            if (i%4==0) {
              sum +=i; 
              
            }
            
        }
        System.out.println("The sum of Nth Natural Number :"+sum); 
sc.close();
    }
}
