//Prime Factors
package primefactors;
import java.util.Scanner;
public class PrimeFactors {
    public static void main(String[] args) {
        // TODO code application logic here
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.print("enter n : " );
        n=sc.nextInt(); 
        for(int d=2;d<n;d++){
            while(n%d==0){
                n=n/d;
                System.out.println(d);   
            }
        }
        if(n!=1){
            System.out.println(n);
        }
    }
}
