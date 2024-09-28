
import java.util.Scanner;

public class Prime {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        boolean isPrime =true;
         for(int i=2; i*i<=n; i++){
            if(n%i==0){
                isPrime=false;
                break;
                
         }

         sc.close();
    }
if (isPrime==true) {
    System.out.println("Your Enter Number is Prime ");
}else{
    System.out.println("Your Enter Number is Not Prime ");
}

 }


}