import java.util.Scanner;

public class StringPalindrome {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The String :");
        String str = sc.next();
         String rev ="";

         for(int i=str.length()-1;i>=0;i--){
            rev =rev +str.charAt(i);
         }
        if (str.equals(rev)) {
            System.out.println("Your Enter String is Palindrome ");
        }else{
            System.out.println("Your Enter String is Not Palindrome .");
        }
        sc.close();
    }
}
