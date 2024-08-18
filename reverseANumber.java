//reverse of the given number
package reverseofanumber;
import java.util.*;
public class ReverseOfANumber {
    public static void main(String[] args) {
        int num;
        int sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number u want to reverse : ");
        num=sc.nextInt();
        int temp=num;
        while(num>0){
            int r=num%10;
            sum=(sum*10)+r;
            num=num/10;
        }
        System.out.println(sum+ " is reverse of " + temp);
        
    }
    
}
