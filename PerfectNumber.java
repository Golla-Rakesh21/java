//Perfect Number
package perfectnumber;
import java.util.*;
public class PerfectNumber {
    public static void main(String[] args) {
        int num,sum=1;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number : ");
        num=sc.nextInt();
        int temp=num;
        if(num==1){
            System.out.println("Not a perfect number");
        }
        else{
            for(int i=2;i<num;i++){
                if(num%i==0){
                    sum+=i;
                }
            }
            if(sum==temp){
                System.out.println("perfect number");
            }
            else {
                System.out.println("Not a perfect number");
            }
        }
        
    }
    
}
