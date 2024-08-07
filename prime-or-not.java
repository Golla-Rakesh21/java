//prime or not
package primeornot;
import java.util.Scanner;
public class PrimeOrNot {
    public static void main(String[] args) {
        // TODO code application logic here
        int num;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number : ");
        num=sc.nextInt();
        if(num<=1){
            System.out.println(num+" is Not prime");
        }
        else{
            for(int i=2;i<=num/2;i++){
                if(num%i==0){
                    System.out.println(num+" is Not prime");
                }    
            }
         System.out.println(num+" is prime");
        }
    }
}
