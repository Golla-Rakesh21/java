//Harshad Number
package harshadnumber;
import java.util.Scanner;
public class HarshadNumber {
    public static void main(String[] args) {
        // TODO code application logic here
        int num,sum=0,r,temp;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number : ");
        num=sc.nextInt();
        temp=num;
        while(temp>0){
            r=temp%10;
            temp=temp/10;
            sum=sum+r;
        }
        if(num%sum==0){
            System.out.println(num+" is harshad number");
        }
        else{
            System.out.println(num+" is not harshad number");
        }
    }
}
