
package sumofnnaturalnumbers;
import java.util.*;
public class SumofNnaturalNumbers {
    public static void main(String[] args) {
        
        System.out.println("program : sum of n natural numbers");
        int sum=0;
        int n;
        Scanner sc =new Scanner(System.in);
        System.out.print("enter the number: ");
        n=sc.nextInt();
        if(n>0){
        for(int i=1;i<=n;i++){
            sum=sum+i;
         }
        System.out.println("sum of the n natural numbers are : "+sum);
        } 
        
        else{
            System.out.println("The n should be greater then zero");
        }
        
    }
    
}
