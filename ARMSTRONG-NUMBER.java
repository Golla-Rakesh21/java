
//armstrong Number checker
package armstrongnumber;
import java.util.*;
public class ArmstrongNumber {
    public static void main(String[] args) {
        // TODO code application logic here
        int num,sum=0,r,temp;
        Scanner sc=new Scanner(System.in);
         System.out.print("Enter number to check : ");
        num=sc.nextInt();
        temp=num;
        while(num>0){
            r=num%10;
            sum=sum+(r*r*r);
            num=num/10;
        }
        if(temp==sum){
            System.out.println("armstrong number");
        }
        else{
             System.out.println("not armstrong number");
        }
    }
    
}
