import java.util.Scanner;

public class PalindromeNum {
    public static void main(String[] args) {
        int n ,temp,rem,s=0 ;
        System.out.print("Enter the Number :");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        temp=n;

        while (n >0) {
            rem = n%10;
             s= (s*10)+rem;
            n=n/10;

            
        }
        if (temp==s) {
            System.out.println("Your Enter Number is Palindrome.");
        }else{
            System.out.println("Your Enter number is not Palindrome.");
        }
        sc.close();
    }
}
