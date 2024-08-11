//Lcm of two numbers
package lcmoftwonumbers;
import java.util.Scanner;
public class LcmOfTwoNumbers {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any two numbers : ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int g=0;
        for(int i=1;i<=a;i++){
            if(a%i==0&&b%i==0){
                g=i;
            }
        }
        //product of two numbers is equals is product od gcd and lcm
        int product=a*b;    
        int LCM=product/g;
        System.out.println("LCM : "+LCM);
    }
    
}
