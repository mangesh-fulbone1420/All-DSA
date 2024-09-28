import java.util.*;
public class Factorial {
    public static void main(String[] args) {
        System.out.print("Enter the Factorial :");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //int n = 5;
        int fact = 1;
        for(int i=1;i<=n;i++){

            fact*=i;
            
        }
        System.out.println("Factorial of "+ n + " is "+ fact );
        sc.close();
}
}
