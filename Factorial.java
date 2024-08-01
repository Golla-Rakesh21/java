//factorial
package factorial;
import java.util.*;
public class Factorial {
    public static void main(String[] args) {
        // TODO code application logic 
        Scanner sc=new Scanner(System.in);
        int fact = 1;
        System.out.print("Enter the number for factorial : ");
        int num=sc.nextInt();
        for(int i=num;i>=1;i--){
           fact*=i;
        }
        System.out.println("factorial of "+num+" is "+fact);
    }
}
