
import java.util.*;

public class If{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        if (age>=18) {
            System.out.println("Your Eligible for Voting .");
            
        }else{
            System.out.println("You are not Eligible for Voting .");
        }
        sc.close();
    }
}