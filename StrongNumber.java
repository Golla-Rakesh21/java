//Strong number
package strongnumber;
import java.util.*;
public class StrongNumber {
    public static void main(String[] args) {
        int num,r,sum=0,temp;
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();
        temp=num;
        while(num>0){
            r = num%10;
            int fact=1;
             for(int i=r;i>=1;i--){
               fact*=i;
            }
            sum=fact+sum;
            num=num/10;
        }
        if(sum==temp){
            System.out.println("strong number");
        }
        else{
            System.out.println("not strong number");
        }
        
    }
    
}
