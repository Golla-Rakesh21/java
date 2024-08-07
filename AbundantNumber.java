//Abundant Number
package abundantnumber;
import java.util.Scanner;
public class AbundantNumber {
    public static void main(String[] args) {
        // TODO code application logic here
        int sum=0,num;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number : ");
        num=sc.nextInt();
        for(int i=1;i<=num/2;i++){
            if(num%i==0){
                sum+=i;
            }
        }
        System.out.println("Sum is : "+sum);
        if(sum>num){
            System.out.println("Sum is greater than num.so given number is Abundant Number");
        }
        else{
            System.out.println("Sum is not greater than num.so given number is Not Abundant Number");
        }
    }
    
}
