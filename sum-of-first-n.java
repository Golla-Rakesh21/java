
package sumoffirstnnaturalnumbers;
import java.util.Scanner;
public class SumOfFirstNnaturalNumbers {
    public static void main(String[] args) {
        // TODO code application logic here
         System.out.println("program : sum of first n natural number form a particular starting number");
        int sum=0;
        int n;
        int start;
        Scanner sc =new Scanner(System.in);
        System.out.print("enter the starting number you want to add from : ");
        start=sc.nextInt();
        System.out.print("enter the no of numbers you want to add : ");
        n=sc.nextInt();
        for(int i=0;i<n;i++){  //sum of first n natural number form a particular starting number.
         sum=sum+i+start;
        }
        System.out.println("sum of the n natural numbers are : "+sum);
    }   
}
    
