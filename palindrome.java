//palindrome number checker
package palindromeofnumber;
import java.util.*;
public class PalindromeOfNumber {
    public static void main(String[] args) {
        int num1,num2,r,sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number for palindrome check :");
        num1=sc.nextInt();
        num2=num1;
        while(num1>0){
            r=num1%10;
            sum=(sum*10)+r;
            num1=num1/10;
        }
        if(num2==sum){
            System.out.println("Given number is palindrome");
        }
        else{
            System.out.println("Given number is not palindrome");
        }
    }
    
}
