//Fibonacci series
package fibonacciseries;
import java.util.Scanner;
public class FibonacciSeries {
    public static void main(String[] args) {
        // TODO code application logic here
        int n1=0,n2=1,n3,n;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number : ");
        n=sc.nextInt();
        for(int i=1;i<n;i++){
            System.out.print(n1 + " ");
            n3=n2+n1;
            n1=n2;
            n2=n3;
            
        }
        
    }
    
}
